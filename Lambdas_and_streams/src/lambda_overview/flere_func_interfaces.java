package lambda_overview;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import eksempelklasser.Person;

public class flere_func_interfaces {
	
	public static void main(String [] args) {
	
	
	// Java har mange funksjonelle interfaces.
	// 		Dette er interfaces bestående av en enkelt abstrakt metode
	
	
		// PREDICATE
		Predicate<String> isNotEmpty = s -> !s.isEmpty();
		boolean t = isNotEmpty.test("Er denne strengen tom?"); 
			
		// FUNCTION
		Function<String, Integer> lengthFunction = String::length;
		int i = lengthFunction.apply("Hvor lang er denne strengen?");
		// Kombinerer funksjoner med FUNCTION
		Function<Integer, Integer> multiply = x -> x * 2;
		Function<Integer, Integer> add = x -> x + 3;
		Function<Integer, Integer> addThenMultiply = multiply.compose(add);
		int x = addThenMultiply.apply(2);
		
		// CONSUMER
		List<Person> people = new ArrayList<>();
		Consumer<Person> printName = p -> System.out.println(p.getFirstname());
		people.forEach(printName);
		
		// SUPPLIER
		Supplier<LocalDateTime> currentTime = LocalDateTime::now;
		LocalDateTime tid = currentTime.get();
	
		// UNARY OPERATOR
		UnaryOperator<Integer> square = z -> z * z;
		int res = square.apply(10);
		
		// BINARY OPERATOR
		BinaryOperator<Integer> sum = (a, b) -> a + b;
		int result = sum.apply(5, 10); // Resultat: 15
	
		// BI PREDICATE
		BiPredicate<String, Integer> isLongerThan = (str, length) -> str.length() > length;
		boolean output = isLongerThan.test("Preben", 5);
	
		// BI FUNCTION
		BiFunction<String, Integer, String> createDescription = (name, age) -> name + " is " + age + " years old.";
		String description = createDescription.apply("Alice", 25);
	
		// BI CONSUMER
		BiConsumer<String, Integer> printRepeated = (str, n) -> System.out.println(str.repeat(n));
		printRepeated.accept("Preben", 5);

	}

}
