package streams_oppgaver;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class basics {
	
	private static List<String> words = Arrays.asList("apple", "banana", "grape", "pear", "orange");
    private static List<Integer> numbers = Arrays.asList(3, 8, 1, 5, 12, 7, 2, 10);
    private static List<String> sentences = Arrays.asList("This is a sample sentence.", "Another example here.", "Stream processing is powerful.");

    public static void main(String[] args) {
        // Oppgave 1:
        BiFunction<List<String>, String, List<String>> filterWordsStartingWith = (list, prefix) -> {
            return list.stream()
                .filter(w -> w.startsWith(prefix))
                .collect(Collectors.toList());
        };
        System.out.println("Oppgave 1: " + filterWordsStartingWith.apply(words, "b"));

        // Oppgave 2
        UnaryOperator<List<Integer>> doubleAllNumbers = (list) -> {
            return list.stream()
                .map(x -> x*2)
                .collect(Collectors.toList());
        };
        System.out.println("Oppgave 2: " + doubleAllNumbers.apply(numbers));

        // public static List<Integer> doubleAllNumbers(List<Integer> list) {
        //     return list.stream()
        //         .map(x -> x*2)
        //         .collect(Collectors.toList());
        // };
        // System.out.println(("Oppgave 3: " + doubleAllNumbersMethod(numbers)));

        // // Oppgave 3:

        Function<List<String>, String> convertToUpperCaseAndConcatenate = (list) -> {
            return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining());
        };

        System.out.println("Oppgave 3: " + convertToUpperCaseAndConcatenate.apply(sentences));

        // // Oppgave 4:

        Function<List<String>, String> findLongestWord = (list) -> {
            return list.stream()
                .reduce((w1, w2) -> {
                    if(w1.length() > w2.length()) {
                        return w1;
                    } else {
                        return w2;
                    }
                })
                .orElse("");
        };

        System.out.println("Oppgave 4: " + findLongestWord.apply(words));

        // // Oppgave 5:
        // System.out.println("Oppgave 5: " + findSumOfSquares(numbers));

        // // Oppgave 6:
        // System.out.println("Oppgave 6: " + countWordsWithLength(words, 5));

        // // Oppgave 7:
        // System.out.println("Oppgave 7: " + concatenateDistinctLetters(words));

        // // Oppgave 8:
        // System.out.println("Oppgave 8: " + findAverageWordLength(sentences));

        // // Oppgave 9:
        // System.out.println("Oppgave 9: " + squareAndSumEvenNumbers(numbers));

        // // Oppgave 10:
        // System.out.println("Oppgave 10: " + joinWordsWithComma(words));
    }

}
