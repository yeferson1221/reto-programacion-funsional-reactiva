package use;
import reactor.core.publisher.Flux;
import util.Words;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static com.google.common.primitives.Ints.asList;
import static java.util.Arrays.stream;

/**
 *  Crear un chat, un input donde lo que se ingrese sea almacenado en una lista, para posteriormente cambiar en la lista
 *  las malas palabras, para sos y compararlas con la lista del chat y si se encuentra una reemplazarla por: **** ,
 *  todo esto respetando los principios de la programación reactiva.
 * @author [Yeferson Valencia, alejandro.yandd@gmail.com   ]
 * @since [1,0,0]
 */
public class Chat {
    Scanner in = new Scanner(System.in);
    /**
     *  El metodo pide ingresar 4 palabras  System.out.println("Ingresa Palabra: ") dentro de la longitud LongArray
     *  despues se ingresan a una lista llamada chatInput despues esta se trasforma en una   Flux.fromIterable(chatMessage)
     *  aplicando la reactividad  luego entra en un condicional donde se cambian las malas palabras de la lista  Words.getWords()
     *  por  messages = "****";
     * @author [Yeferson Valencia, alejandro.yandd@gmail.com   ]
     * @since [1,0,0]
     */
    public void filterChat() {
        List<Integer> LongArray = asList(0,1,2,3);
        LongArray.stream()
                .map(element -> {
                    System.out.println("Ingresa Palabra: ");
                    String chatInput = in.nextLine();
                    List<String> chatMessage = stream(chatInput.split(" ")).collect(Collectors.toList());
                    return Flux.fromIterable(chatMessage)
                            .map(messages -> {
                                if (Words.getWords().contains(messages.toLowerCase())) {
                                    messages = "****";
                                }
                                return messages;
                            })
                            .reduce("", (acum, message) -> acum +=" "+message)
                            .subscribe(listCorrect -> System.out.println(listCorrect.toString()));
                })
                .collect(Collectors.toList());
//


    }
}
