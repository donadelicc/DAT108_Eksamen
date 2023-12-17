package H22;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class O1 {

    public static void main(String[] args) {
    
    // a))
    System.out.println("----------------OPPGAVE 1 A--------------------");

    Consumer<String> o1_a = a -> System.out.println(a); // der a er en String
    o1_a.accept("O1_A");;
    BiFunction<String, String, Integer> o1_b = (a,b) -> a.compareTo(b); // der a og b er String-er
    System.out.println("O1_B: "+o1_b.apply("Preben", "Predator"));
    UnaryOperator<Integer> o1_c = a -> a * a; // der a er et heltall
    System.out.println("O1_c: "+ o1_c.apply(5));
    Predicate<Integer> o1_d = a -> a > 0; // der a er et heltall
    System.out.println("O1_d: "+ o1_d.test(2));
    BinaryOperator<Integer> o1_e = (a,b) -> a + b; // der a og b er heltall
    System.out.println("O1_e: "+ o1_e.apply(2, 2));

    //b

    List<Integer> liste = List.of(1,2,3,4,5,6,7,8,9);
    Predicate<Integer> b = num -> num % 3 == 0;
    List<Integer> resultat = utplukk(liste, b);
    System.out.println(resultat);

    // c)

    List<Bil> biler = List.of(
    new Bil("EK 12345", "Tesla model Y"),
    new Bil("EV 52345", "Tesla model Y"),
    new Bil("SV 12346", "Mazda 5"),
    new Bil("SU 24680", "Volvo 240"),
    new Bil("EL 24683", "Nissan Leaf"));
    
    List<Bil> elbilListe = biler.stream()
        .filter( b -> b.startsWith("E"))
        .collect(Collectors.toList());

    // d)
    Consumer<List<Bil>> printElbiler = elbilliste -> elbilListe.stream()
        .distinct()
        .forEach( b -> System.out.println(b));

    printElbiler.accept(elbilListe);

    // e)

    List<Kundedata> kundeliste = List.of(
        new Kundedata("Arne", 1234),
        new Kundedata("Per", 2234),
        new Kundedata("Pål", 1000),
        new Kundedata("Emma", 4000),
        new Kundedata("Ine", 5234),
        new Kundedata("Tone", 1111)
    );

    Function<List<Kundedata>, Integer> beregnTotalforbruk = kundeliste -> kundeliste.stream()
        .mapToInt(Kundedata::getKwh)
        .sum();
    
    Integer totalforbruk = beregnTotalforbruk.apply(kundeliste);

    // f)

    // Lag en metode beregnTotalInntekt(...) som tar inn en kundeliste og en funksjon for
    // prisberegning for en enkelt kunde, og som regner ut total inntekt med dette som input


    //g)
    Function<Kundedata, Double> prisberegning = kunde -> kunde.getKwh() * 1.5;


    }

    // g)

     static Double beregnTotalInntekt(List<Kundedata> kundeliste, Function<Kundedata, Integer> prisberegning) {
        return kundeliste.stream()
            .mapToDouble(prisberegning::apply)
            .sum();
    };


   //Hejlpemetode til b)
    static List<Integer> utplukk(List<Integer> liste, Predicate<Integer> b) {
        return liste.stream().filter(b).toList();
    };
}
