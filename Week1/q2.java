package Week1;

import java.util.Scanner;

public class q2 {
	static int Binary(int arr[], int low, int high, int data) {
		
		if(low<high) {
			int mid = low + (high - low)/2;
			
			if(arr[mid] == data) {
				return mid;
			}
			if(arr[mid]<data) {
				return Binary(arr, mid+1, high, data);
			}
			else {
				return Binary(arr, low, mid-1, data);
			}
		}
		
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// For Test Case:
		int t = sc.nextInt();
		
		for(int j=0;j<t;j++) {
		
			// Size of array
			int n = sc.nextInt();
			// Input array
			int [] arr = new int[n];
			
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			// Searching element
			int data = sc.nextInt();
			
			int result = Binary(arr, 0, n-1, data);
			
			if(result == -1)
				System.out.println("Not Present " + n);
			else
				System.out.println("Present " + (result+1) );
		
		}
	}
}
	
	


