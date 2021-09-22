package Week3;
import java.util.Scanner;
public class q3 {
	public static void qs(int arr[], int l, int h) {
		if(l<h) {
			int pivot = arr[h];
			int i = l-1;
			int temp;
			for(int j=l;j<h;j++) {
				if(arr[j]<pivot) {
					i++;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			temp = arr[1+i];
			arr[i+1] = arr[h];
			arr[h] = temp;
			qs(arr,l,i);
			qs(arr,i+2,h);
			
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int a = 0; a < t; a++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			//41//
			qs(arr,0,n-1);
			System.out.println();
			int dup = 0;
			
			for(int j=0;j<n-1;j++) {
				if(arr[j] == arr[j+1]) {
					System.out.println("YES");
					dup = 1;
					break;
				}
			
			}
			if(dup==0)
				System.out.println("NO");
		}
	}
}
