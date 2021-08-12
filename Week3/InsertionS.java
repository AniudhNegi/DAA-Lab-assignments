package InsertionSort;
import java.util.Scanner;

public class InsertionS {
	
	public static void insertion(int arr[]) {
		for(int i=1;i<arr.length;i++) {//Unsorted array
			
			int temp =arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>temp) {
				//Swap
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
			
		}
	}
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		insertion(arr);
		System.out.println("Sorted Array:");
		print(arr);
		
	}

}
