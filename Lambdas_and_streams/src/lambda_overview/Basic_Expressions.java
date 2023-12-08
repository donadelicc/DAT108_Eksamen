package lambda_overview;

public class Basic_Expressions {
	
	public static void main(String[] args) {
		
		// Defining lambda expressions
		
		MyLambda aBlockOfCode = () -> System.out.print("Hello");

		MyTwoMultiplier doubleNumberFuction = (int a) -> a*2;
		
		MyAdd addFunction = (int a, int b) -> a + b;
		
		MyDivide safeDivideFunction = (int a, int b) -> {
			if(b == 0) return 0;
			return a/b;
		};
		
		MyStringLen stringLengthCountFunction = (String s) -> s.length();
		
		// Running the expressions
		
		int add = doubleNumberFuction.twoMultiplier(5);
		int multiply = addFunction.add(50, 49);
		int divide = safeDivideFunction.divide(100, 20);
		int len = stringLengthCountFunction.stringLen("Tyranusaurusrex");
		
		System.out.print("Lambda Expression Ex.1\n");
		aBlockOfCode.foo();
		System.out.print("\nLambda Expression Ex.2:\n"
						+ add 
						+"\nLambda Expression Ex.3:\n"
						+ multiply
						+"\nLambda Expression Ex.4:\n"
						+ divide
						+"\nLambda Expression Ex.5:\n"
						+ len + "\n"
						);
	}
	

	// Defining interfaces for the lambda expressions
	
	interface MyLambda {
		void foo();
	}
	interface MyTwoMultiplier {
		int twoMultiplier(int a);
	}
	
	interface MyAdd {
		int add(int x, int y);
	}
	interface MyDivide {
		int divide(int a, int b);
	}
	interface MyStringLen {
		int stringLen(String s);
	}
	interface PrintPrint {
		void print();
	}

}
