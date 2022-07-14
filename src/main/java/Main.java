import model.Email;
import use.Case;
import use.Chat;
import use.Derivate;
import util.DataUtil;

import java.util.List;

/**
 *  ejecuta el proyecto
 *  por  messages = "****";
 * @author [Yeferson Valencia, alejandro.yandd@gmail.com   ]
 * @since [1,0,0]
 */
public class Main {
    public static void main(String[] args) {
       List<Email> listEmail = DataUtil.getEmails();
       Case cas = new Case();
       Chat chat = new Chat();
       Derivate derivate = new Derivate();
        System.out.println("Correos Lista: " +cas.execute());
        System.out.println("");
        System.out.println("..................................................................................................................................................................................................................");

        System.out.println("Correos Distinct: " +cas.executeDistinct());
        System.out.println("");
        System.out.println("..................................................................................................................................................................................................................");

        System.out.println("Correos Filtro: " +cas.executeFilter());
        System.out.println("");
        System.out.println("..................................................................................................................................................................................................................");

        System.out.println("Correos Total de Correos: "+cas.countEmails(listEmail));
        System.out.println("");
        System.out.println("..................................................................................................................................................................................................................");

        System.out.println("Correos @ y el dominio: " +cas.validateEmail());
        System.out.println("");
        System.out.println("..................................................................................................................................................................................................................");

        System.out.println("Correos si se envió un correo: " +cas.validateEmailActiveAndDesactive());
        System.out.println("");
        System.out.println("..................................................................................................................................................................................................................");

        System.out.println("");
        System.out.println("PUNTO DERIVADAS INTEGRALES");
        System.out.println("la derivada numerica puntual en x=5 es: "+derivate.DerivateNumericaPuntual(5));
        System.out.println("");
        System.out.println("Integral: "+derivate.integralFuntion(5,6));
        System.out.println("");
        System.out.println("..................................................................................................................................................................................................................");

        System.out.println("");
        System.out.println("CHAT");
        chat.filterChat();

    }
}
