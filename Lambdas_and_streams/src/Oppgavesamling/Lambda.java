package Oppgavesamling;

import java.util.Arrays;
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

public class Lambda {

    public static void main(String[] args) {

        // A

        // I 
        UnaryOperator<Integer> ai = x -> 2*x*x+3*x+5;
        int res1 = ai.apply(3);
        System.out.println(res1);

        // II
        UnaryOperator<String> a2 = String::toUpperCase;
        String res2 = a2.apply("preben");
        System.out.println(res2);
        
        // III
        Function<Integer, String> a3 = x -> String.valueOf(x*x + 2);
        String res3 = a3.apply(3);
        System.out.println(res3);

        //IV
        BiFunction<Double, Double, Function<Double, Double>> a4 = (a, b) -> (x -> a*x + b);
        Function<Double, Double> res4 = a4.apply(2.0, 2.0);
        System.out.println(res4.apply(2.0));
    
        // V

        Consumer<String> a5 = x -> System.out.println(x.toUpperCase());
        a5.accept("preben");

        // B)
        System.out.println("---------------------B------------------------");

        // I
        Predicate<String> b1 = x -> x.startsWith("A");
        boolean tester = b1.test("Aleksander");
        System.out.println(tester);

        // II

        Function<Integer, Double> b2 = x -> x*0.5;
        Double d = b2.apply(2);
        System.out.println(d);

        // III
        BiFunction<String, String, String> b3 = (x,y) -> x.length() < y.length() ? x : y;
        String smallestString = b3.apply("hey", "hallo");
        System.out.println(smallestString);

        /// IV
        BiPredicate<String, Integer> b4 = (x,y) -> x.length() < y;
        boolean measureString = b4.test("Preben", 10);
        System.out.println("Har 'Preben' mindre enn 5 bokstaver? "+ (measureString == true ? "Jepp" : "Nope"));

        // V
        BiConsumer<String, Predicate<String>> b5 = (x,y) -> System.out.println(y.test(x) ? "Ja" : "Nei");
        b5.accept("Aksel", b1);

        //C)
        System.out.println("-------------------------C------------------------");

        //I
        Supplier<Double> c1 = () -> 0.253;
        Double num = c1.get();
        System.out.println(num);

        // II
        
        // Predicate<List<Person>> c2 = 
        // c2.test(new Person("Kari", "Jensen", 21)); // true

        //III

        Function<String, Integer> c3 = (a) -> a.length();
        int str_len = c3.apply("Hei!");
        System.out.println(str_len);

        // IV

        Consumer<String> c4 = str -> System.out.println(str);
        c4.accept("Kari"); // returneres ingenting.

        // V
        BiFunction<String, Integer, Person> c5 = (fulltnavn, alder) -> {
            String[] splittetNavn = fulltnavn.split(" ");
            String fornavn = splittetNavn[0];
            String etternavn = splittetNavn[1];
            return new Person(fornavn, etternavn, alder);
        };

        Person p = c5.apply("Kari Jensen", 21); // returneres et objekt av typen Person.
        System.out.println(p);


        // D)
        System.out.println("-----------D-----------------");

        // I:
        
        // INN: En streng
        // UT: En liste med alle ordene i strengen

        Function<String, List<String>> d1 = (str) -> {
            String[] stringListe = str.split(" ");
            List<String> new_list = Arrays.asList(stringListe);
            return new_list;
        };
        List<String> listeMedStrenger = d1.apply("Hei jeg heter Preben");
        System.out.println(listeMedStrenger);

        // II
        //NN: En person (Person x) og et predikat (Predikat<Person> y)
        //UT: "Ja" hvis predikatet stemmer for personen x, "Nei" ellers.
        
        BiFunction<Person, Predicate<Person>, String> d2 = (person, predicate) ->  {
            return predicate.test(person) ? "Ja" : "Nei";
        };
        Person pers = new Person("Tom", "Tommy", 99);
        Predicate<Person> pred = (person) -> person.getAge() > 18;
        String resultat = d2.apply(pers, pred);
        System.out.println(resultat);

        //III)
        // INN: To lister (List<?> x, List<?> y)
        // UT: Et negativt tall dersom x er kortere enn y, 0 om og x og y er like
        // lange og et positivt tall om x er lengre enn y

        BiFunction<List<String>, List<String>, Integer> d3 = (list1, list2) -> Integer.valueOf(list1.size()).compareTo(Integer.valueOf(list2.size()));
        List<String> firstArr = Arrays.asList("Hey", "hoe", "let's go!"); // 3
        List<String> secondArr = Arrays.asList("What's", "up"); // 4
        Integer i = d3.apply(firstArr, secondArr);
        System.out.println(i);
    }
}