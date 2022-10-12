package ExceptionHandling;

import java.util.Scanner;

public class ArithmeticException1 {

	public static void main(String[] args) {
		System.out.println("enter the values");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
		int c=a/b;
		throw new UnsupportedOperationException("anything by zero is invalid");
		}
		catch(Exception e) {
			System.out.println("divide by number zero is invalid");
		}
		
	}

}
