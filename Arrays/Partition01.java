public class Partition01 {
public static int partition(int arr[],int s) {
	int l=0;
	int r= s-1;
	int c=0;
	while(l<r) {
		while(arr[l]==0)
			l++;
		while(arr[r]==1)
			r--;
	if(l<r) {
		swap(arr,l,r);
		c++;
	}
	}
	return c;	
}
	private static void swap(int[] arr, int l, int r) {
		int temp=0;
temp=arr[l];
arr[l]=arr[r];
arr[r]=temp;
}
	public static void printArray(int arr[],int n) {	
		System.out.println("Array after segregation is");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {0,1,1,0,0,0,1};
int s=arr.length;
partition(arr,s);
printArray(arr,s);
	}
}
