import model.Email;
import use.Case;
import use.Chat;
import use.Derivate;

public class Main {
    public static void main(String[] args) {
       Case cas = new Case();
       Chat chat = new Chat();
       Derivate derivate = new Derivate();
        System.out.println("Correos: " +cas.execute());
        System.out.println("");
        System.out.println("..................................................................................................................................................................................................................");
        System.out.println("Correos: " +cas.executeDistinct());
        System.out.println("");
        System.out.println("..................................................................................................................................................................................................................");
        System.out.println("Correos: " +cas.validateEmail());
        System.out.println("");
        System.out.println("..................................................................................................................................................................................................................");
        System.out.println("Correos: " +cas.validateEmailActiveAndDesactive());
        System.out.println("");
        System.out.println("..................................................................................................................................................................................................................");
        System.out.println("la derivada numerica puntual en x=5 es: "+derivate.DerivateNumericaPuntual(5));
        System.out.println("");
        System.out.println("Integral: "+derivate.integralFuntion(5,6));
        System.out.println("");
        System.out.println("..................................................................................................................................................................................................................");
        chat.filterChat();

    }
}
