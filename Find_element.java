// if array is already   sorted by row and coloumn
// example ------------ 11   12  13   14
//                      15   16  17   18
//                      19   20  21   22
//                      23   24  25   26

//           input----- 16
//           ouput------ yes present nut apply simple approach


package Two_D_Array;
import java.util.Scanner;
public class Find_element {
	public static boolean search(int arr[][], int input) {
		int i=0; int j=arr[0].length;
		//int input=sc.nextInt();
		while(j>=0 && i<arr[0].length) {
			if(input==arr[i][j]) {
				return true;
			}
			else if(input>arr[i][j])
				i++;
			else
				j--;
		}
		return false;
	}
	
	public static void main(String args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int [][] arr=new int[n][n];
		for(int i=0;i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int input=sc.nextInt();
		boolean isFound= search(arr, input);
		if(isFound) {
			System.out.println("Present");
		}
		else {
			System.out.println("Not Present");
		}
	}
}
