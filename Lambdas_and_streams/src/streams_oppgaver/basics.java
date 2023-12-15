package streams_oppgaver;

import java.util.Arrays;
import java.util.List;

public class basics {
	
	private static List<String> words = Arrays.asList("apple", "banana", "grape", "pear", "orange");
    private static List<Integer> numbers = Arrays.asList(3, 8, 1, 5, 12, 7, 2, 10);
    private static List<String> sentences = Arrays.asList("This is a sample sentence.", "Another example here.", "Stream processing is powerful.");

    public static void main(String[] args) {
        // Oppgave 1:
        System.out.println("Oppgave 1: " + filterWordsStartingWith(words));

        // Oppgave 2:
        System.out.println("Oppgave 2: " + doubleAllNumbers(numbers));

        // Oppgave 3:
        System.out.println("Oppgave 3: " + convertToUpperCaseAndConcatenate(sentences));

        // Oppgave 4:
        System.out.println("Oppgave 4: " + findLongestWord(words));

        // Oppgave 5:
        System.out.println("Oppgave 5: " + findSumOfSquares(numbers));

        // Oppgave 6:
        System.out.println("Oppgave 6: " + countWordsWithLength(words, 5));

        // Oppgave 7:
        System.out.println("Oppgave 7: " + concatenateDistinctLetters(words));

        // Oppgave 8:
        System.out.println("Oppgave 8: " + findAverageWordLength(sentences));

        // Oppgave 9:
        System.out.println("Oppgave 9: " + squareAndSumEvenNumbers(numbers));

        // Oppgave 10:
        System.out.println("Oppgave 10: " + joinWordsWithComma(words));
    }

    // Oppgave 1:
    private static List<String> filterWordsStartingWith(List<String> list) {
        // Fyll ut kroppen til metoden
        //return;
    }

    // Oppgave 2:
    private static List<Integer> doubleAllNumbers(List<Integer> list) {
        // Fyll ut kroppen til metoden
        return /*resultatet*/;
    }

    // Oppgave 3:
    private static String convertToUpperCaseAndConcatenate(List<String> list) {
        // Fyll ut kroppen til metoden
        return /*resultatet*/;
    }

    // Oppgave 4:
    private static String findLongestWord(List<String> list) {
        // Fyll ut kroppen til metoden
        return /*resultatet*/;
    }

    // Oppgave 5:
    private static int findSumOfSquares(List<Integer> list) {
        // Fyll ut kroppen til metoden
        return /*resultatet*/;
    }

    // Oppgave 6:
    private static long countWordsWithLength(List<String> list, int length) {
        // Fyll ut kroppen til metoden
        return /*resultatet*/;
    }

    // Oppgave 7:
    private static String concatenateDistinctLetters(List<String> list) {
        // Fyll ut kroppen til metoden
        return /*resultatet*/;
    }

    // Oppgave 8:
    private static double findAverageWordLength(List<String> list) {
        // Fyll ut kroppen til metoden
        return /*resultatet*/;
    }

    // Oppgave 9:
    private static int squareAndSumEvenNumbers(List<Integer> list) {
        // Fyll ut kroppen til metoden
        return /*resultatet*/;
    }

    // Oppgave 10:
    private static String joinWordsWithComma(List<String> list) {
        // Fyll ut kroppen til metoden
        return /*resultatet*/;
    }


}
