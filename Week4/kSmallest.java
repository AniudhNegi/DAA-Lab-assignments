package Week4;
import java.util.Scanner;
public class kSmallest {
	static int cmp = 0;
	public static int find(int arr[], int l, int h, int k) {
		
		int p = arr[h], i =l-1, j = l;
		while(j<=h) {
			cmp++;
			if(arr[j]<=p) {
				int t = arr[++i];
				arr[i] = arr[j];
				arr[j] = t;
			}
			j++;
		}
		cmp++;
		if(i==k) {
			return arr[i];
		}
		else if(i<k) {
			return find(arr, i+1, h, k);
		}
		else {
			return find(arr, l, i-1,k);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0;i<t;i++) {
			int k ;
			int siz = sc.nextInt();
			int arr[] = new int [siz];
			for(int j=0;j<siz;j++) {
				arr[i] = sc.nextInt();
			}
			k = sc.nextInt();
			int sol = find(arr,0,(siz-1),k);
			System.out.println(sol);
			System.out.println("Comparision "+cmp);
		}
	}

}
