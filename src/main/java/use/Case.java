package use;

import model.Email;
import util.DataUtil;

import java.util.List;
import java.util.stream.Collectors;

/**
 * conteine la clase Case donde tengo el primer ejercicio de los correos
 * solo tiene los metodos que manipula la lista de correos
 * Distinct: para ver si hay correo repetidos, si hay correos repetidos eliminarlos
 * Filtro: para saber si hay correos con dominio gmail, hotmail y outlook.
 * Map: para saber si todos los correos cumple con todas las condiciones (Que cuente con el @ y el dominio)
 * Saber la cantidad de correos que hay, sin usar un ciclo
 * Saber la cantidad de correos gmail, hotmail y outlook sin usar un ciclo
 * @version [1,0.0]
 *
 * @author [Yeferson Valencia, alejandro.yandd@gmail.com   ]
 * @since [1,0,0]
 *
 */
public class Case {
    public static List<String> execute(){
        List<Email> emails = DataUtil.getEmails();
        return emails.stream()
                .map(email -> email.getEmail())
                .collect(Collectors.toList());
    }

    /**
     * Distinct: para ver si hay correo repetidos, si hay correos repetidos eliminarlos
     * @version [1,0.0]
     *
     * @author [Yeferson Valencia, alejandro.yandd@gmail.com   ]
     * @since [1,0,0]
     *
     */
    public static List<Email> executeDistinct(){
        List<Email> emails = DataUtil.getEmails();
        return emails.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    /**
     * [
     *  Filtro: para saber si hay correos con dominio gmail, hotmail y outlook.
     * @version [1,0.0]
     *
     * @author [Yeferson Valencia, alejandro.yandd@gmail.com   ]
     * @since [1,0,0]
     *
     */
    public static List<List<String>> executeFilter(){
        List<Email> emails = DataUtil.getEmails();
        System.out.println("Correos validador si es Gmail, hotmail, oublock");
        List<String> emailsGmail = emails.stream()
        .filter(email->email.getEmail().contains("@gmail"))
                .map(emailFilter->emailFilter.getEmail()+ " [GMAIL] ")
                .collect(Collectors.toList());
        List<String> emailsHotmail = emails.stream()
        .filter(email->email.getEmail().contains("@hotmail.com"))
                .map(emailFilter->emailFilter.getEmail()+" [HOTMAIL] ")
                .collect(Collectors.toList());
        List<String> emailsOublock = emails.stream()
                .filter(email->email.getEmail().contains("@Oublock.com"))
                .map(emailFilter->emailFilter.getEmail()+ " [OUBLOCK] " )
                .collect(Collectors.toList());

        return List.of(emailsGmail, emailsHotmail, emailsOublock);

    }

    /**
     *
     *  Map: para saber si todos los correos cumple con todas las condiciones (Que cuente con el @ y el dominio)     * @version [1,0.0]
     *
     * @author [Yeferson Valencia, alejandro.yandd@gmail.com   ]
     * @since [1,0,0]
     *
     */
    public static Boolean validateEmail(){
        List<Email> emails = DataUtil.getEmails();
        Boolean emailsTrue = emails.stream()
                .map(email -> email.getEmail())
                .map(validator -> validator.matches("^[a-zA-Z0-9_!#$%&'\\*+/=?{|}~^.-]+@[a-zA-Z0-9.-]+$"))
                .reduce((validator1, validator2)-> validator1 & validator2).get();
        return emailsTrue;
    }

    /**
     *
     *  En la misma lista determinar si se envió un correo o no a cada uno de los correos,
     *  si se le envió cambiar el estado en la lista, todo esto respetando la inmutabilidad.
     *
     * @author [Yeferson Valencia, alejandro.yandd@gmail.com   ]
     * @since [1,0,0]
     *
     */
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

    /**
     *  Saber la cantidad de correos que hay, sin usar un ciclo
     * @author [Yeferson Valencia, alejandro.yandd@gmail.com   ]
     * @since [1,0,0]
     */
    public Long countEmails(List<Email> listEmail) {
        return listEmail.stream()
                .filter(email -> email.getEmail().matches("^[a-zA-Z0-9_!#$%&'\\*+/=?{|}~^.-]+@[a-zA-Z0-9.-]+$"))
                .count();
    }

}
