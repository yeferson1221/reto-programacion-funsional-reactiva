package use;
import reactor.core.publisher.Flux;
import util.Words;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static com.google.common.primitives.Ints.asList;
import static java.util.Arrays.stream;


public class Chat {
    Scanner in = new Scanner(System.in);
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
