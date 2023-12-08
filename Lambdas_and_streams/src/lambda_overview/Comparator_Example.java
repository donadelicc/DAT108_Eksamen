package lambda_overview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import eksempelklasser.Person;

public class Comparator_Example {
	
	public static void main(String[] args) {
		  
		List<String> list = new ArrayList<>();
		
		list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
		
		// Tradional
		Collections.sort(list, new Comparator<String>() {
		    @Override
		    public int compare(String a, String b) {
		        return a.compareTo(b);
		    }
		});	

        // Shuffle the list to reset the order
        Collections.shuffle(list);

        
        // Basic lambda expression
        Collections.sort(list, (a, b) -> a.compareTo(b));

  
        
        List<Person> people = Arrays.asList(
        		new Person("John", "Doe", 30),
        		new Person("Alice", "Wonderland", 25));
        
        // Sort list of people by lastname and firstname
        
        // ALT 1.
        Comparator<Person> byLastName = Comparator.comparing(Person::getLastname);
        Comparator<Person> byFirstName = Comparator.comparing(Person::getFirstname);
        Comparator<Person> combinedComparator = byLastName.thenComparing(byFirstName);
        people.sort(combinedComparator);
        
        // ALT 2.
        people.sort(Comparator.comparing(Person::getLastname).thenComparing(Person::getFirstname));

        // Sort list of people by age
        Collections.sort(people, (p1, p2) -> p1.getAge() - p2.getAge());

        
        
		
	}
}
