import model.Email;
import use.Case;
import use.Chat;

public class Main {
    public static void main(String[] args) {
       Case cas = new Case();
       Chat chat = new Chat();
        System.out.println("Correos: " +cas.execute());
        System.out.println("Correos: " +cas.executeDistinct());
        System.out.println("Correos: " +cas.executeFilter());
        System.out.println("Correos: " +cas.validateEmail());
        System.out.println("Correos: " +cas.validateEmailActiveAndDesactive());
        chat.filterChat();

    }
}
