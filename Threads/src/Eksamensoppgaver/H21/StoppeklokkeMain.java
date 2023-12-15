package Eksamensoppgaver.H21;

import javax.swing.JOptionPane;

public class StoppeklokkeMain {
    public static void main(String[] args) throws InterruptedException {
        StopWatch stoppeklokke = new StopWatch();
        JOptionPane.showConfirmDialog(...);
        stoppeklokke.start();
        JOptionPane.showConfirmDialog(...);
        stoppeklokke.stop();
        System.out.println("\nSluttid: " + stoppeklokke.formatTime());
    }
}