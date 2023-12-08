package lambda_overview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class metodereferanse_Example {
	
	public static void main(String[] args) {
	
	List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
	names.forEach(System.out::println);
	
	List<String> lowerCaseNames = names.stream()
			.map(String::toUpperCase)
			.collect(Collectors.toList());
	
	Supplier<List<String>> listSupplier = ArrayList::new;
	List<String> anotherList = listSupplier.get();
	
	Collections.sort(names, String::compareToIgnoreCase);


	
	}
	
	


}
