package week2;

import java.util.Scanner;

public class q3 {
	 static int pairs(int arr[], int data) {
		 int c = 0 ;
		 for(int i=0;i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]-arr[j] == data || arr[j]-arr[i] == data) {
					 c++;
				 }
			 }
		 } 
		 return c;		 
	 }	 
	 public static void main(String args[]) {
			 Scanner sc = new Scanner(System.in);
			 int t =sc.nextInt();
			 
			 for(int k=0;k<t;k++) {
				 int n = sc.nextInt();
				 int [] arr = new int[n];
				 for (int i=0;i<n;i++) {
					 arr[i] = sc.nextInt();					 
				 }
				 int data = sc.nextInt();
				 System.out.println(+pairs(arr,data));
			 }
		 }
}
