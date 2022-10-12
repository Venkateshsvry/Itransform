package BasiDataStructure;

import java.util.Scanner;

public class StudentAT {

	public static void main(String[] args) {
		System.out.println("enter the values");
		Scanner sc=new Scanner(System.in);
		double sum=0.0;
		double average=0.0;
		
		
		double student[][]=new double[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				student[i][j]=sc.nextDouble();				
			}			
		}
		for(int i=0;i<3;i++) {
			sum=0.0;
			for(int j=0;j<3;j++) {				
			 sum=sum+student[i][j];		
			}				
			System.out.println("sum of student"+i+" "+"is" +sum);
			System.out.println("average of student"+i+" is "+ sum/3);
		}
		for(int i=0;i<3;i++) {
			sum=0.0;
			for(int j=0;j<3;j++) {
				sum=sum+student[j][i];
				
			}
			System.out.println("sum of subject" +i+" "+"is" +sum);
			System.out.println("average of subject"+i+" "+ "is"+sum/3);
		}
		
		
	}
}
