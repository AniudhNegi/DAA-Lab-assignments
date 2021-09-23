package Week5;
import java.util.Scanner;
public class common {
	public static int main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int arr[] = new int[m];
		for(int i=0;i<m;i++) {
			arr[i]=sc.nextInt();
		}
		int n = sc.nextInt();
		int arr1[] = new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		int i =0, j=0;
		while(i!=m && j!=n) {
			if(arr[i] == arr1[j]) {
				System.out.print(arr[i++] + " ");
				j++;
			}
			else if(arr[i]<arr1[j]) {
				++i;
			}
			else {
				j++;
			}
		}
		
		
		return 0;
	}

}
