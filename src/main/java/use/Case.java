package use;

import model.Email;
import util.DataUtil;

import java.util.List;
import java.util.stream.Collectors;

public class Case {
    public static List<String> execute(){
        List<Email> emails = DataUtil.getEmails();
        return emails.stream()
                .map(email -> email.getEmail())
                .collect(Collectors.toList());
    }

    public static List<Email> executeDistinct(){
        List<Email> emails = DataUtil.getEmails();
        return emails.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<List<String>> executeFilter(){
        List<Email> emails = DataUtil.getEmails();
        List<String> emailsGmail = emails.stream()
        .filter(email->email.getEmail().contains("@gmail"))
                .map(emailFilter->emailFilter.getEmail())
                .collect(Collectors.toList());
        List<String> emailsHotmail = emails.stream()
        .filter(email->email.getEmail().contains("@hotmail.com"))
                .map(emailFilter->emailFilter.getEmail())
                .collect(Collectors.toList());
        List<String> emailsOublock = emails.stream()
                .filter(email->email.getEmail().contains("@hotmail.com"))
                .map(emailFilter->emailFilter.getEmail())
                .collect(Collectors.toList());

        return List.of(emailsGmail, emailsHotmail, emailsOublock);

    }

    public static Boolean validateEmail(){
        List<Email> emails = DataUtil.getEmails();
        Boolean emailsTrue = emails.stream()
                .map(email -> email.getEmail())
                .map(validator -> validator.matches("^[a-zA-Z0-9_!#$%&'\\*+/=?{|}~^.-]+@[a-zA-Z0-9.-]+$"))
                .reduce((validator1, validator2)-> validator1 & validator2).get();
        return emailsTrue;
    }

    public static List<List<String>> validateEmailActiveAndDesactive(){
        List<Email> emails = DataUtil.getEmails();
        List<String> emailsTrue = emails.stream()
                .filter(email->email.getEstado() == true)
                .map(emailFilter->emailFilter.getEmail())
                .collect(Collectors.toList());
        List<String> emailsFalse = emails.stream()
                .filter(email->email.getEstado() == false)
                .map(emailFilter->emailFilter.getEmail())
                .collect(Collectors.toList());
        return List.of(emailsTrue, emailsFalse);
    }

}
