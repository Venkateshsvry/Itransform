package BasiDataStructure;

import java.util.Scanner;

public class CalculateSimpleCompound {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("principal in terms of integers");
		int principal=sc.nextInt();
		System.out.println("interest in integer");
		int interest=sc.nextInt();
		System.out.println("time in form of months");
		int time=sc.nextInt();
		float simpleinterest=(principal*interest*time)/100;
		System.out.println(simpleinterest);
		
		
		

	}

}
