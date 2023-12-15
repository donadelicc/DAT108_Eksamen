package Eksamensoppgaver.V23;

public class Rulletekst extends Thread{

    private Banner banner;
    
    public Rulletekst(String tekst) {
        banner = new Banner(tekst);
    }

    public void setTekst(String tekst) {
        banner.setText(tekst);
    }


    @Override
	public void run() {
		while(true) {
            banner.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
	    }
    }
}

