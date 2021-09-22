package InsertionSort;
import java.util.Scanner;

public class InsertionS {
	
	public static void insertionS(int arr[]) {
		int cmp = 0 , shift = 0;
		
        for(int i=1; i<arr.length; ++i) {//Unsorted array
			
			int temp =arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>temp ) {
				//Swap
				cmp++;
				++shift;
				arr[j+1] = arr[j];
				--j;
			}
			arr[j+1] = temp;
			++shift;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");			
		}
		System.out.println("");
		System.out.println("comparistion = " + cmp);
		System.out.println("shifts = " + shift);
		
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int s = sc.nextInt();
			int arr[] = new int[s];
			
			for(int j =0 ; j< s; j++) { 
				arr[j] = sc.nextInt();
				
			}	
			insertionS(arr);
			System.out.println("");
		}
	}

}
