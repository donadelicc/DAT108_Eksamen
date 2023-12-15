package ManipulereTråd;

public class StoppeTråd {

    public static void main(String[] arg) {

        TrådSomKanStoppes t = new TrådSomKanStoppes("Preben sin tråd");

        t.setDaemon(true);

        t.start(); // Starter en ny tråd

		try {
            Thread.sleep(5000); // Hovedtråden sover i 5 sekunder
        } catch (InterruptedException e){
            System.out.print(e);
        }
        
		
		t.stopp(); // Den nye tråden avsluttes av hovdedtråden som har våknet opp igjen
		try {
    		t.join();            
        } catch (InterruptedException e) {
            System.out.println(e);
        }
		
		System.out.println(Thread.currentThread().getName() + " avsluttes");

    }
    
}
