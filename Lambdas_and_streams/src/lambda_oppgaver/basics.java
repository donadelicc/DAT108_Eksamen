package lambda_oppgaver;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import eksempelklasser.Person;

public class basics {

    public static void main(String []args) {

        // Oppgave 1: Skriv en lambda som tar et tall og returnerer det dobbelte.
        UnaryOperator<Integer> doubleNumber = (a) -> a*2;
        Integer min_double = doubleNumber.apply(5);

        // Oppgave 2: Skriv en lambda som tar to tall og returnerer summen.
        BinaryOperator<Integer> sum = (a, b) -> a+b;
        Integer minsum = sum.apply(2, 3);

        // Oppgave 3: Skriv en lambda som tar en streng og skriver den ut til konsollen.
        Consumer<String> print = (a) -> System.out.println(a);
        print.accept("Streng til konseollen");

        // Oppgave 4: Skriv en lambda som tar en streng og returnerer true hvis den er tom, ellers false.
        Predicate<String> isEmpty = (a) -> a.isEmpty();
        boolean tomStreng = isEmpty.test("");

        // Oppgave 5: Bruk metodereferanse til å referere til Integer.parseInt metoden.
        Function<String, Integer> parseInt = Integer::parseInt;
        int parsed_int = parseInt.apply("55");

        // Oppgave 6: Lag et String-objekt og bruk metodereferanse for objektets toUpperCase metode.
        String exampleString = "test";
        Supplier<String> toUpperCase = exampleString::toUpperCase;
        String upperCase = toUpperCase.get();

        // Oppgave 7: Bruk metodereferanse til String sin length metode for å finne lengden på en streng.
        Function<String, Integer> length = String::length;
        int str_len = length.apply("exampleString");

        // Oppgave 8: Skriv en lambda som tar en Person og returnerer personens navn.
        Function<Person, String> getName = (p) -> p.getFirstname();
        Person p = new Person("Preben", "Andersen", 24);
        String firstname = getName.apply(p);

        // Oppgave 9: Bruk en konstruktørreferanse for å lage en ny instans av Person.
        Supplier<Person> newPerson = Person::new;
        Person person = newPerson.get();

        // Oppgave 10: Skriv en lambda som tar en streng og konverterer den til et tall, håndter NumberFormatException.
        Function<String, Integer> parseWithExceptionHandling = (str) -> {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                return null;
            }
        };
        int my_parsed_int = parseWithExceptionHandling.apply("10");

        // Oppgave 11: Skriv en lambda som returnerer en tilfeldig tall.
        Supplier<Double> random = Math::random;
        Double ran_num = random.get();

        // Oppgave 12: Skriv en lambda som tar en liste av tall og returnerer summen.
        Function<List<Integer>, Integer> sumOfList = (list) -> {
            int tot = 0;
            for(int num : list) {
                tot += num;
            }
            return tot;
        };
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum_of_list = sumOfList.apply(numbers);
        System.out.println(sum_of_list);

            // Med STREAMS

        Function<List<Integer>, Integer> sumOfList2 = (list) ->  {
            return list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        };
        Integer sum_of_list2 = sumOfList.apply(numbers);
        System.out.println(sum_of_list2);

        // Oppgave 14: Skriv en lambda som tar en Person og endrer personens navn.
        Consumer<Person> changeName = (pp) -> pp.setFirstname("Nytt navn");
        changeName.accept(person);


        // Oppgave 15: Kombiner to Predicate grensesnitt for å lage et nytt som sjekker om en streng er ikke-null og ikke-tom.
        Predicate<String> isNotNullAndNotEmpty = (str) -> str != null && !str.isEmpty();
        boolean notnullandnotempty = isNotNullAndNotEmpty.test(null);

    }

    
    
}
