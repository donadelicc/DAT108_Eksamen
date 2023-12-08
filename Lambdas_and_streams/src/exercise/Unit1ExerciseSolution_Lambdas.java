package exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import eksempelklasser.Person;

public class Unit1ExerciseSolution_Lambdas {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Preben", "Andersen", 24),
				new Person("Barack", "Obama", 56),
				new Person("Tom", "Huddleston", 34),
				new Person("Andy", "Carrol", 31),
				new Person("Peaky", "Blinders", 14),
				new Person("Cindy", "Crawford", 44)
				);
		
		// Step 1: Sort list by last name
		Collections.sort(people, ( p1, p2) -> p1.getLastname().compareTo(p2.getLastname()));
		
		

		// Step 2: Create a method that prints all elements in the list
		System.out.println("Print all people in the list:");
		printConditionally(people, p -> true);
		
		// Step 3: Create a method that prints all people that have  
		// 	a last name beginning with 'C'
		
		System.out.println("\nPrint all people with last name beginning with 'C':");		
		//printConditionally(people, p -> p.getLastname().startsWith("C"));
		printConditionally2(people, p -> p.getLastname().startsWith("C"));
		System.out.println("\nPrint all people with first name beginning with 'P':");		
		//printConditionally(people, p -> p.getFirstname().startsWith("P"));
		printConditionally2(people, p -> p.getFirstname().startsWith("P"));
		
	}

	// Using Function Interfaces
	private static void printConditionally2(List<Person> people, Predicate<Person> predicate) {
		for(Person p: people) {
			if(predicate.test(p)) {
				System.out.println(p);
			}
		}
		
	}
	
	
	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p: people) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
	}
		
}




