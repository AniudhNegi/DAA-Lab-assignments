package SelectionSort;

import java.util.Scanner;

public class SelectionS {
	
	public static void selectionS(int arr[]) {
		
		int cmp = 0;
		int swap = 0;
		for(int i =0;i<arr.length - 1;i++) {//0 to n-1 iterations 
			int temp = arr[i];
			int tempidx = i;
			// searching for minimum element
			for(int j =i+1 ;j<arr.length;j++) {
				cmp++;
				if(arr[j]<temp) {
					temp = arr[j];
					tempidx = j;					
				}
			}
			swap++;
			
			if(tempidx != i) {
				arr[tempidx] = arr[i];
				arr[i] = temp;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");			
		}
		System.out.println("");
		System.out.println("comparistion = " + cmp);
		System.out.println("swap = " + swap);
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i <= t; i++) {
			int s = sc.nextInt();
			int arr[] = new int[s];
			
			for(int j =0 ; j< s; j++) { 
				arr[j] = sc.nextInt();
				
			}	
			selectionS(arr);
			System.out.println("");
		}
	}

}
