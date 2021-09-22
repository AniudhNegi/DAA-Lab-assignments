package Week4;
import java.util.Scanner;
public class mergeS {
	static int  cmp = 0 , inv = 0;
	public static void merge(int arr[], int l, int m, int h) {
		int n = h - l + 1;
		
		int temp[] = new int[n];
		int a = l, b = m+1;
		int cur = 0;
		while(a<=m && b<=h) {
			cmp++;
			if(arr[a]<arr[b]) {
				temp[cur++] = arr[a++];
			}
			else
				inv++;
				temp[cur++]=arr[b++];
		}
		while(a<=m) {
			temp[cur]=arr[a];
			a++;
			cur++;
		}
		while(b<=h) {
			temp[cur]=arr[a];
			a++;
			cur++;
		}
		int v = 0;
		for(int i = 0; i<h;i++) {
			arr[i] = temp[v++];
		}					
	}
	
	public static void mSort(int arr[], int l, int h) {
		if(l<h) {
			int m = l+(h-l)/2;
			mSort(arr,l,m);
			mSort(arr,m+1,h);
			merge(arr,l,m,h);
		}
			 
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t , s ;
		t = sc.nextInt();
		for(int i=0; i<t; i++) {
			s = sc.nextInt();
			int arr[] = new int[s];
			for(int x = 0; x < s;x++) {
				arr[x] = sc.nextInt();
			}
			//
			mSort(arr,0,(s-1));
			for(int k = 0 ; k < s ; k++) {
				System.out.print(arr[k] + " ");
		    }
			System.out.println();
			System.out.println("Comparistion "+cmp);
			System.out.println("Inversion "+inv);
		}

	}
}
