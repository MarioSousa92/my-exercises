package io.codeforall.fanstatics;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String message = "I'll send an SOS to the garbage world, " +
                "I hope that someone garbage gets my message in a garbage bottle.";

        String result = Arrays.stream(message.split(" ")) // transformar a String numa Stream
                .filter(word -> !word.equalsIgnoreCase("gargage")) // verifica se as palavras não é "gargage" se não for passam pelo filtro
                .map(String::toUpperCase) // transforma as palavras que passam no filtro em maiusculas
                .collect(Collectors.joining(" ")); // junta as palavras numa unica String

        System.out.println(result);
    }
}
