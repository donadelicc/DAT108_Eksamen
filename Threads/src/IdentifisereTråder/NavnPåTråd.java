package IdentifisereTråder;

public class NavnPåTråd {

    public static void main(String[] args) {
		
		/*
		 * Vi kan identifisere tråder via trådens navn via klasse-metoden 
		 * Thread.currentThread().getName()
		 */
		
		Runnable minRunnable = new MinRunnable(); //se nederst		
		// Oppretter og starter 10 tråder som sier hva de heter
		// Trådens navn angis som (valgfri) parameter nr 2 i konstruktøren
		for (int i=1; i<=10; i++) {
			String traadnavn = "tråd" + i;
			Thread t = new Thread(minRunnable, traadnavn);
			t.start();
		}

        for (int i = 0; i < 10; i++) {
            String traadnavn = "tråd" + i;
            Thread t = new Thread(new MinRunnable(), traadnavn);
            t.start();
        }

		
		// Hva heter main-tråden?
		System.out.println("Hallo fra " + Thread.currentThread().getName());
	}
}

class MinRunnable implements Runnable {
	@Override
	public void run() {
		String traadnavn = Thread.currentThread().getName();
		System.out.println("Hallo fra " + traadnavn);
	}
}

class MinTraad extends Thread{

    @Override
	public void run() {
		System.out.println("Hallo fra MinTraad");
	}

    
}
