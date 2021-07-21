package Week1;

import java.util.Scanner;

public class q1 {
	static int LS(int arr[], int data) {
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i] == data) {
				return i;
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
			
			int result = LS(arr, data);
			
			if(result == -1)
				System.out.println("Not Present " + n);
			else
				System.out.println("Present " + (result+1) );
		}
	}
	
	
}