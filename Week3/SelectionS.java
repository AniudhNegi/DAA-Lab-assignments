package SelectionSort;

import java.util.Scanner;

public class SelectionS {
	
	public static void sort(int arr[]) {
		for(int i =0;i<arr.length - 1;i++) {//0 to n-1 iterations 
			int temp = arr[i];
			int tempidx = i;
			// searching for minimum element
			for(int j =i+1 ;j<arr.length;j++) {
				if(arr[j]<temp) {
					temp = arr[j];
					tempidx = j;
				}
			}
			//swap
			if(tempidx != i) {
				arr[tempidx] = arr[i];
				arr[i] = temp;
			}
		}
		
	}
	 static void print(int arr[]){
	        
	    	int n =arr.length;
	        
	    	for (int i=0;i<n;i++){
	        	
	            System.out.print(arr[i] + " ");
	        }
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr);
		System.out.println("Sorted Array:");
		print(arr);
		

	}

}
