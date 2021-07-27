package Week1;
import java.util.Scanner;
public class q3 {
	public static int JS(int arr[], int data) {
		int n =arr.length;
		
		//Block Size To Jump
		int s = (int)Math.floor(Math.sqrt(n));
		int c = 0;
		int p = 0;
		while(arr[Math.min(s, n)-1] < data) {
			p = s;
			s += (int)Math.floor(Math.sqrt(n));
			if(p >= n)
				return -1;
		}
		while(arr[p] < data) {
			p++;
			
			if(p == Math.min(s, n));
				return -1;
		}
		
		if(arr[p] == data)
			return p;
		
	 return -1;	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// For Test Case:
		int t = sc.nextInt();
		
		for(int j=0;j<t;j++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			int data = sc.nextInt();
			int result = JS(arr, data);
			if(result == -1)
				System.out.println("Not Present");
			else
				System.out.println("Present" + result);
				
		}
	}

}
