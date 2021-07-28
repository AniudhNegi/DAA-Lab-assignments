package week2;

import java.util.Scanner;

public class q1 {
	
  public static int BS(int arr[], int data, boolean f) {
	  int l = 0;
	  int r = arr.length -1 ;
	  
	  int res = -1;
	  
	  while(l<=r) {
		  
		  int mid = l + (r-l)/2;
		  
		  if(arr[mid] == data) {
			 res =  mid;
			 //search left
			 if(f) {
				 r = mid - 1;
			 }
			 //search right
			 else {
				 l = mid + 1;
			 }
		  }
		  if(data < arr[mid]) {
			  r = mid - 1;
		  }
		  else {
			  l = mid + 1;
		  }
	  }
	  
   return res;
  }
  
  public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// For Test Case:
		int t = sc.nextInt();
		
		for(int j = 0; j < t; j++) {
			int n = sc.nextInt();
			
			int arr[] = new int [n];
			
			for(int i = 0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			int data = sc.nextInt();
			
			int first = BS(arr, data, true);
			
			int last = BS(arr, data, false);
			
			int c = last - first + 1;
			
			if(first == -1) {
				System.out.println("Not Present");
			}
			else {
				System.out.println(+data + " - " + c);
			}
			
		}
	  
	  
  }
  
}
