package V23;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class O1 {

    public static void main(String[] args) {


        // a) 

        Predicate<Integer> o1_a = h -> h >= 0 && h <= 59; // der h er et heltall
        System.out.println("O1_a: "+ o1_a.test(58));
        Predicate<Boolean> o1_b = b -> !b; // der b er en boolsk verdi
        System.out.println("O1_b: "+ o1_b.test(15 > 100));
        Predicate<String> o1_c = s -> s.startsWith("A"); // der s er en string
        System.out.println("O1_c: "+o1_c.test("Apples"));
        Function<String, Integer> o1_d = String::length;
        System.out.println("O1_d: "+ o1_d.apply("Preben"));
        Consumer<String> o1_e = System.out::println; // Her er det flere muligheter. Velg én
        o1_e.accept("Hei");

        // b)

        List<Eksamen> eksamener = Arrays.asList(
            new Eksamen("DAT102", LocalDate.of(2023, Month.MAY, 30), 150),
            new Eksamen("DAT107", LocalDate.of(2023, Month.MAY, 15), 160),
            new Eksamen("DAT108", LocalDate.of(2023, Month.JUNE, 6), 50);
        );

        Comparator<Eksamen> kronologisk = Comparator.comparing(Eksamen::getDate);

        Collections.sort(eksamener, kronologisk);
        
        Consumer<List<Eksamen>> sorterteEksamener = list -> list.forEach(
            e -> System.out.println(e.toString()));
        sorterteEksamener.accept(eksamener);

        // c)

        List<String> fikse(List<String> liste, UnaryOperator<String> f) {
            return liste.stream().map(f).toList();
        }

        List<String> liste = List.of("ola", "Per", "pÅL", "ESPEN");

        UnaryOperator<String> navnefiks = str -> {
            String lowerCase = str.toLowerCase();
            String capitalizedStr = Character.toUpperCase(lowerCase.charAt(0)) + lowerCase.substring(1);
            return capitalizedStr;
        };

        List<String> resultat = fikse(liste, navnefiks);
        System.out.println(resultat);
        

        // d) Skriv ut alle eksamener i juni

        UnaryOperator<List<Eksamen>> konteeksamener = e -> {
            return e.stream()
                .filter(e -> e.getDate().getMonth() == Month.JUNE && e.getEmnekode().equals("DAT108"))
                .collect(Collectors.toList());
        };

        /// e Skriv ut alle eksamenskodene

        Consumer<List<Eksamen>> emnekoder = e -> {
            e.stream()
                .map(Eksamen::getEmnekode)
                .distinct()
                .forEach(System.out::println);
        };


        // f)

        // Bruker emnekoder fra d

        Integer gjennomsnittKonte = (int) (konteeksamener.stream()
            .mapToInt(Eksamen::getOppmøte)
            .average()
            .orElse(0.0));
    }




}