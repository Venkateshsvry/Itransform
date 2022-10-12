package BasiDataStructure;

import java.util.Scanner;

public class StudentGrades {

	public static void main(String[] args) {
		System.out.println("enter the values");
		Scanner sc=new Scanner(System.in);
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		if(s1>60&&s2>60&&s3>60) {
			System.out.println("passed");
		}
		else if((s1>60&&s2>60)||(s2>60&&s3>60)||(s3>60&&s1>60)) {
			System.out.println("promoted");
		}
		else {
			System.out.println("failed");
		}
	}

}
