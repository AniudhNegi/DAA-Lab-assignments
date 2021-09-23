package Week5;
import java.util.Scanner;
public class countSort {
	public static int main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[] {0};
		
		for(int f=0;f<n;f++) {
			char x = sc.next().charAt(0); 
			arr[x -'a']++;
		}
		
		int ind = -1, max = Integer.MIN_VALUE;
		for(int i =0;i<26;i++) {
			if(arr[i] != 0 && arr[i] != 1 && arr[i]>max) {
				ind = i;
				max = arr[i];
			}
		}
		if(ind>=0) {
			System.out.println((char)('a'+ind) + "-"+arr[ind]);
		}
		else {
			System.out.println("No Duplicates Present");
		}
		
		return 0;
	}

}
