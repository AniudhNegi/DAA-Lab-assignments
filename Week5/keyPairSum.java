package Week5;
import java.util.Scanner;
public class keyPairSum {
	
	public static void merge(int arr[], int l, int m, int h) {
		int a = l, b=m+1;
		int cur = 0;
		int n = h-l+1;
		int temp[] = new int[n];
		while(a<=m && b<=h) {
			if(arr[a]<=arr[b]) {
				temp[cur++]=arr[a++];
			}
			else {
				temp[cur++] = arr[b++];
			}
		}
		while(a<=m) {
			temp[cur]=arr[a];
			a++;
			cur++;
		}
		while(b<=h) {
			temp[cur]=arr[b];
			b++;
			cur++;
		}
		int z = 0;
		for(int i=l;i<=h;i++) {
			arr[i]=temp[z++];
		}
	}
	
	public static void mS(int arr[], int l, int h) {
		if(l<h) {
			int mid = (l+h)/2;
			mS(arr,l,mid);
			mS(arr,mid+1,h);
			merge(arr,l,mid,h);
		}		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int siz,n,f=1;
		siz = sc.nextInt();
		int arr[] = new int[siz];
		for(int j=0;j<siz;j++) {
			arr[j] = sc.nextInt();
		}
		n=sc.nextInt();
		mS(arr,0,(siz-1));
		int start=0, end=siz-1;
		while(start<end) {
			if(arr[start]+arr[end]>n) {
				end--;
			}
			else {
				if(arr[start]+arr[end]==n){
					System.out.println(arr[start]+" "+arr[end] +",");
					f = 0;
				}
				start++;
			}
			if(f==1) {
				System.out.println("NO SUCH PAIR");
			}
		}
		
		
	}
}
