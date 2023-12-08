package lambda_vs_traditionalApproach;

public class TypeInference {
	
	public static void main(String[] args) {
		
		StringLenLambda myLambda = s -> s.length();
		//int len = myLambda.getLen("Tommy Hilfigger");
		//System.out.println(len);
		
		printLambda(s -> s.length());
	}
	
	public static void printLambda(StringLenLambda lambda) {
		System.out.print(lambda.getLen("Hello Lambda Expression"));
	}
	
	interface StringLenLambda {
		int getLen(String s);
	}
}
