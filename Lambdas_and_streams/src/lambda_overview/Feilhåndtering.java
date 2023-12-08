package lambda_overview;

import java.io.IOException;
import java.util.function.Consumer;

public class Feilhåndtering {
	
	public static void main(String[] args) throws IOException {
		
		// Håndtere feil ved å skrive om uttrykket
		Consumer<String> consumer = s -> {
		    try {
		        // Operasjon som kan kaste et sjekket unntak
		    	System.out.println(s.length());
		    } catch (Exception e) {
		        // Håndtering av unntaket
		    	System.out.print(e);
		    }
		};
		consumer.accept("Preben");
		
		// Alternativ feilhåndtering med egendefinert funksjonelt grensesnitt
		ThrowingConsumer<String, IOException> throwingConsumer = str -> {
		    System.out.println(str.toLowerCase());
			
		};
		throwingConsumer.accept("HEY");
		
	}
	
	
	@FunctionalInterface
	public interface ThrowingConsumer<T, E extends Exception> {
	    void accept(T t) throws E;
	}
	



	


}
