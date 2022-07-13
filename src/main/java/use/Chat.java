package use;
import reactor.core.publisher.Flux;
import util.Words;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class Chat {
    Scanner in = new Scanner(System.in);
    public void filterChat() {

        List<Integer> iterador = asList(1,2,3);

        iterador.stream()
                .map(element -> {
                    System.out.println("Ingresa Palabra:");
                    String chatInput = in.nextLine();
                    List<String> chatMessage = stream(chatInput.split(" ")).collect(Collectors.toList());
                    return Flux.fromIterable(chatMessage)
                            .map(message -> {
                                if (Words.getWords().contains(message.toLowerCase())) {
                                    message = "****";
                                }
                                return message;
                            })
                            .reduce("", (acum, message) -> acum +=" "+message)
                            .subscribe(listCorrect -> System.out.println(listCorrect.toString()));

                })
                .collect(Collectors.toList());
//


    }
}
