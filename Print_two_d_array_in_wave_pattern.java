// .................Print 2D array in wave pattern.................
// example     INPUT__________  1  5  9 14
//                              2  13 4  2
//                              8  7  16 1
//                              9 13  2  19

//             OUTPUT_________ 1 2 8 9 13 7 13 5 9 4 16 2 14 2 1 19

package Two_D_Array;
import java.util.Scanner;

public class Print_two_d_array_in_wave_pattern {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
			
				arr[i][j]= sc.nextInt();
			}
		}
		
		for(int j=0; j<arr[0].length; j++) {
			
			
				if(j%2==0) {
					int i=0;
					while(i<arr.length) {
					System.out.print(arr[i][j]+" ");
					i++;
					}
				}
				else {
					int i=arr.length-1;
					while(i>=0) {
						System.out.print(arr[i][j]+" ");
						i--;
					}
				}
			}
	}
}
