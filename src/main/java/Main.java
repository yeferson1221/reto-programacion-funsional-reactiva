import model.Email;
import use.Case;

public class Main {
    public static void main(String[] args) {
       Case cas = new Case();
        System.out.println("Correos: " +cas.execute());
        System.out.println("Correos: " +cas.executeDistinct());
        System.out.println("Correos: " +cas.executeFilter());
        System.out.println("Correos: " +cas.validateEmail());
        System.out.println("Correos: " +cas.validateEmailActiveAndDesactive());



    }
}
