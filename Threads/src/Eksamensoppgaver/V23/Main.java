package Eksamensoppgaver.V23;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Banner banner = new Banner("Heia Brann!");

        Rulletekst rulletekst = new Rulletekst("Heia Brann");

        rulletekst.start();

        try (Scanner scanner = new Scanner(System.in)) {
            while(true) {
                System.out.print("Skriv inn ny tekst: ");
                String nyTekst = scanner.nextLine();

                rulletekst.setTekst(nyTekst);
            }
        }
    }
    
}
