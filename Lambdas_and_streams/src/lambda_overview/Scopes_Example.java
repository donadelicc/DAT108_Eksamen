package lambda_overview;

import java.util.function.IntUnaryOperator;

public class Scopes_Example {

	private static int instanceVar = 2;
	private String msg = "Hello Lambda using 'this'";

	@Override
	public String toString() {
		return msg;
	}
	
	public static void main(String[] args) {
		
		
		// Scope: LOKAL VARIABEL
		String str = "Hello Lambda";
		printLambda(s->s.length(), str);
	
		// Scope: STATISK INSTANSVARIABEL
		localVarMethod(2);
		
		//Scope: THIS FOR INSTANSVARIABEL
		Scopes_Example ex = new Scopes_Example();
		ex.thisMethod();	
	
	}
	
	// Bruk av this
	public void thisMethod() {
        Runnable r = () -> System.out.println(this.toString());
        r.run();
    }

	// Bruk av statisk instansvariabel
	public static void localVarMethod(int i) {
        IntUnaryOperator multiplier = x -> x * instanceVar;
        int result = multiplier.applyAsInt(i);
        instanceVar = 3;
        System.out.println(result);
        System.out.println(instanceVar);
    }
	
	// Metode som tar inn et lambda-uttrykk og kaller på eget grensesnitt
	public static void printLambda(StringLenLambda lambda, String str) {
		System.out.println(lambda.getLen(str));
	}
	
	// Egendefinert funksjonelt grensesnitt
	interface StringLenLambda {
		int getLen(String s);
	}
}

