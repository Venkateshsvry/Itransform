package BasiDataStructure;

public class Bubblesort {

	public static void main(String[] args) {
		FindEle fe=new FindEle();
		int arr[]=new int[15];
		arr=fe.arr;
		int n=15;
		int temp=0;
		for(int i=0;i<14;i++) {
			for(int j=0;j<n-i-1;j++)
			if(arr[j]>arr[j+1]) {
				temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
				
			}
			
		}
		
		for(int i=0;i<15;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
