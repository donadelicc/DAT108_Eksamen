package exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import eksempelklasser.Person;

public class Unit1Exercise {
	@FunctionalInterface
	interface MySort {
		void sortList(List<Person> people);
	}
	@FunctionalInterface
	interface MyPrint {
		void printList(List<Person> people);
	}
	
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
		
		// Traditional approach
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastname().compareTo(p2.getLastname());
			}
		});
		
		

		// Step 2: Create a method that prints all elements in the list
		System.out.println("Print all people in the list:");
		printAll(people);
		
		// Step 3: Create a method that prints all people that have
		// 	a last name beginning with 'C'
		
		System.out.println("\nPrint all people with last name beginning with 'C':");
		//printLastNameBeginningWithC(people);
		
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getLastname().startsWith("C");
			}
		});
		System.out.println("\nPrint all people with first name beginning with 'C':");		
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getFirstname().startsWith("P");
			}
		});
		
				
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p: people) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
		
	}
	
	private static void printLastNameBeginningWithC(List<Person> people) {
		for(Person p: people) {
			if(p.getLastname().startsWith("C")) {
				System.out.println(p);
			}
		}
		
	}

	private static void printAll(List<Person> people) {
		for(Person p: people) {
			System.out.println(p);
		}
		
	}

	
}
interface Condition {
	boolean test(Person p);
}


