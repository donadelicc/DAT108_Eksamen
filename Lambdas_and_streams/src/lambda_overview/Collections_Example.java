package lambda_overview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Collections_Example {
	
	public static void main(String[] args) {
		
		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(
				3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5));
		
		// Sortering
		Collections.sort(numbers);
		System.out.println("Sorted list: " + numbers);
		
		Collections.sort(numbers, (a, b) -> b - a);
		System.out.println("Sorted in descending order: " + numbers);
		
		// Søk
		Collections.sort(numbers); // --> listen må være sortert
		int index = Collections.binarySearch(numbers, 5);
		System.out.println("Index of 5 is at index: " + index);
		
		// Tilegner elementene en tilfeldig plass i listen
		Collections.shuffle(numbers);
		numbers.forEach(System.out::print);
		
		//Reversering
		Collections.reverse(numbers);
		System.out.println("Reversed list: " + numbers);

		//Rotering
		Collections.rotate(numbers, 2);
		System.out.println("Rotated list: " + numbers);

		// Max
		Integer maxNumber = Collections.max(numbers);
		Integer minNumber = Collections.min(numbers);
		System.out.println("Max: " + maxNumber + ", Min: " + minNumber);

		// Telle elementfrekvens
		int el_frequency = Collections.frequency(numbers, numbers.get(0));
		System.out.println("Number "+numbers.get(0)+" frequncy: "+el_frequency);
		
		// Fylling
		Collections.fill(numbers, 0);
		System.out.println("List after fill: " + numbers);
		
		// Erstatt
		Collections.replaceAll(numbers, 0, 1);
		System.out.println("List after replaceAll: " + numbers);

		//Kopier
		List<Integer> copiedList = new ArrayList<>(
				// fyller den tomme listen med tallet 0 for hele størrelsen til "numbers"
				Collections.nCopies(numbers.size(), 0));
		Collections.copy(copiedList, numbers);
		System.out.println("New copied list:");
		copiedList.forEach(System.out::print);
		

	}

}
