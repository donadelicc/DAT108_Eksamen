package Eksamensoppgaver.V22;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;


public class Ball {

    private JFrame frame;
    private BallPanel ballPanel;
    private int x = 0, y = 100; // Startposisjon for ballen
    private int xVelocity = 0; // Hastighet i x-retning

    public void settOppGUI() {
        frame = new JFrame("Ball Animasjon");
        ballPanel = new BallPanel();
        frame.add(ballPanel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void animer() {
        while (true) {
            x += xVelocity;
            ballPanel.repaint();
            try {
                Thread.sleep(20); // Kontrollerer oppdateringshastigheten
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public void gass() {
        xVelocity++; // Øker hastigheten
    }

    public void brems() {
        if (xVelocity > 0) xVelocity--; // Reduserer hastigheten
    }

    public void avslutt() {
        frame.dispose(); // Lukker GUI-vinduet
    }

    class BallPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.fillOval(x, y, 30, 30); // Tegner ballen
        }
    }
}

