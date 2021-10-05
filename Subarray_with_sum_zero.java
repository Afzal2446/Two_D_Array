package Two_D_Array;

public class Subarray_with_sum_zero {
	public static void main(String args[]) {
		int arr[]= {6,3,-3,-6};
		int n=arr.length;
		
		
		for(int i=0; i<n; i++) {
			int sum=0; 
			int j;
			for(j=i; j<n; j++) {
				sum=sum+arr[j];
			}
			if(sum==0) {
				System.out.println("i,j :"+i+" "+j);
			}
		}
	}

}
