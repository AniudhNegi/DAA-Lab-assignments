package Week4;
import java.util.Scanner;

public class quickSort {
	int cmp = 0 ,swap = 0;
	int pivot(int arr[], int l, int h) {
		int p = arr[h];
		int i = l-1, j=1;
		for(j=l;j<h;j++) {
			++cmp;
			if(arr[j]<=p) {
				++swap;
				int temp = arr[++i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		swap++;
		int temp = arr[++i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		return i;
	}
	
	void qs(int arr[],int l, int h) {
		if(l<h) {
			int piv = pivot(arr, l, h);
			qs(arr,l,piv-1);
			qs(arr,piv+1,h);
		}
	}
	
	void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		for(int k =0;k<t;k++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int u=0;u<n;u++) {
				arr[u] = sc.nextInt();
			}
			qs(arr,0,n-1);
			for(int i=0;i<n;i++) {
				System.out.println(arr[i]+" ");
			}
			System.out.println("Comparision "+cmp);
			System.out.println("Swaps "+swap);
		}
		
	}
}
