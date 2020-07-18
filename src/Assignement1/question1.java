package Assignement1;

public class question1 {

	public static void main(String[] args) {
		//1-  Find the outcome  of below snippet and fix the compile time error.
		char a='b';
		char b=85;
		System.out.print ("Value of a+ b : " );
		System.out.print( a+b);

			byte a1=100;
			short b1=20;
			//byte c=a1+b1; Needto upcast
			short c = (short) (a1 + b1);
			System.out.println( "\n Short c value : " +c);
			System.out.println( "looking for GIT");


	        int a3=100;
			long b3=20;
			//int c3=a3+b3;
			long c3=(a3+b3);
			System.out.println("long  c value : " + c3);

			//declare float as use abbreviation f
	        float a4= 5.0f;
			double b4=15.2;
			double c4= a4+b4;
			System.out.println("double c value : " + c4);


	}

}
