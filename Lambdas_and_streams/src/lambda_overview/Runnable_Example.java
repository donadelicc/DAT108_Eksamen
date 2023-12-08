package lambda_overview;

public class Runnable_Example {
	
	public static void main(String[] args) {
		
		// Klassisk eksampel av anonym indre klasse
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printed inside Runnable");	
			}
		});
		
		myThread.run();
				
		// Lambda inline runnable
		Thread myLambdaThread = new Thread(
				() -> System.out.println("Printed inside Lambda Runnable"));
		myLambdaThread.run();
		
		
		new Thread(() -> System.out.println("Running in a thread")).start();
		
		
		Runnable task = () -> System.out.println("Running thread with lamdda...");
		Thread thread = new Thread(task);
		thread.start();
		
	}

}
