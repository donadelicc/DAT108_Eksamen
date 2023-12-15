package Eksamensoppgaver.V22;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Kode inn her */
        Ball ball = new Ball();
        ball.settOppGUI();
        Thread t = new Thread(() -> ball.animer());
        t.start();
        Scanner input = new Scanner(System.in);
        String kommando = input.nextLine();
        while (!kommando.equals("exit")) {
            /* Kode inn her */
            while(t.isAlive()) {
                switch (kommando) {
                    case "g":
                        ball.gass();
                        break;
                    case "b":
                        ball.brems();
                    default:
                        System.out.println("Ugyldig input");
                        break;
                }
            }

            kommando = input.nextLine();
        }
        /* Kode inn her */
        ball.avslutt();
        input.close();
        try {
            t.join();
            
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }

}
