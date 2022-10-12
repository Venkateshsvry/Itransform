package BasiDataStructure;

public class ArmstrongNumber {

	public static void main(String[] args) {		
		for(int i=100;i<1000;i++) {
			int temp=i;
			int n=0;
			int x=0;
		  while (temp>0) {
		  x=temp%10;
		  n=x*x*x+n;
		  temp=temp/10;	
				}		 
		  if(n==i) {
			System.out.println(i);  
		  }		
	}
	}

}
