package Sykronisering;

public class TellerNed extends Thread{

    private Teller teller;
	private int n;
	
	public TellerNed(Teller teller, int n) {
		this.teller = teller;
		this.n = n;
	}
	
	@Override
	public void run() {
		for (int i=0; i<n; i++) {
			//Kan gjøre synchronized(teller) her i stedet for i Teller
			teller.tellNed();
		}
	}
    
}
