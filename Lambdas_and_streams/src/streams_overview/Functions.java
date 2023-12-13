package streams_overview;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Functions {
	
	public static void main(String[] args) {
		
	// OPPRETTELSE AV STREAMS
		
		//Stream.of(): Lager en stream fra en gruppe av elementer.
		Stream<String> stream1 = Stream.of("a", "b", "c");
		
		//Arrays.stream(): Lager en stream fra et array.
		String[] array = {"a", "b", "c"};
		Stream<String> stream2 = Arrays.stream(array);

		//Collection.stream(): Lager en stream fra en samling (f.eks. lister, sett).
		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> stream3 = list.stream();
		
		//Stream.generate() / Stream.iterate(): 
		// Lager en uendelig stream ved hjelp av en Supplier eller en iterativ funksjon.
		Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
		Stream<Integer> numbers = Stream.iterate(0, n -> n + 1);
	
	// INTERMEDIATE/LAZY OPERATIONS
		
		//filter(Predicate): Filtrer elementer basert på en betingelse.
		stream1.filter(x -> x.startsWith("a"));

		//map(Function): Transformerer hvert element i streamen.
		stream1.map(String::toUpperCase);

		//flatMap(Function): Flater ut en stream av streams til en stream av elementer.
		Stream<String[]> arrayStream = Stream.of(new String[]{"a", "b"}, new String[]{"c", "d"});
		Stream<String> flatStream = arrayStream.flatMap(Arrays::stream);

		//distinct(): Fjerner duplikate elementer basert på elementenes equals()-metode.
		stream1.distinct();
		
		//sorted(): Sorterer elementene i streamen.
		stream1.sorted();

		//peek(Consumer): Utfører en handling på hvert element i streamen uten å endre elementene
		stream1.peek(System.out::println);
		
		
	// TERMINAL OPERATIONS
		
		//forEach(Consumer): Utfører en handling for hvert element.
		stream1.forEach(System.out::println);

		//collect(Collector): Samler elementene i en ny form, som en liste eller et sett.
		List<String> list2 = stream1.collect(Collectors.toList());

		//reduce(BinaryOperator): Reduserer elementene til en enkelt verdi ved hjelp av en akkumulerende funksjon.
		Optional<String> result = stream1.reduce((a, b) -> a + b);

		//count(): Returnerer antall elementer i streamen.
		long count = stream1.count();
		
		//anyMatch(Predicate), allMatch(Predicate), noneMatch(Predicate): 
		//	Tester elementene i streamen mot en betingelse.
		boolean anyMatch = stream1.anyMatch(s -> s.contains("a"));
		boolean allMath = stream1.allMatch(s -> s.contains("b"));
		
		//findFirst(), findAny(): Returnerer et valgfritt element fra streamen.
		Optional<String> first = stream1.findFirst();
		Optional<String> any = stream1.findAny();
		
		//limit(long) returnerer en ny stream av streamen med et maks antall
		Stream<String> limit = stream1.limit(2);
		
	//Parallelle streams
		
		//parallel(), sequential(): Brukes til å bytte mellom parallell og sekvensiell behandling.
		Stream<String> parallelStream = list2.stream().parallel();
		
	// Specialized streams
		
		//IntStream, LongStream, DoubleStream: 
		//	Spesialiserte streams for primitive typer for å unngå boksing og unboxing.
		
		IntStream intStream = IntStream.range(1, 10);
		//LongStream
		//DoubleStream
		
		
	}
	
	
	
	

}
