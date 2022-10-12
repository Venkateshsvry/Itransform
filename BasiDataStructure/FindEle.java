package BasiDataStructure;

public class FindEle {
	 int[] arr= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	public static void main(String[] args) {
	
		FindEle fe=new FindEle();
		 for(int i=0;i<15;i++) {
			 if(fe.arr[i]==19) {
				 
				 System.out.println("the value 19 is at the index of"+" "+i);
			 }
		 }

	}

}
