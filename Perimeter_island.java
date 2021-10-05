// Perimeter of ISland.



package Two_D_Array;
import java.util.Scanner;
public class Perimeter_island {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int m= sc.nextInt();
		int arr[][]= new int[n][m];
		for(int i=0; i<n;i++) {
			for(int j=0; j<m; j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		int perimeter=0;
		for(int i=0; i<n;i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j]==1) {
					perimeter+=4;
					if(i>0 && arr[i-1][j]==1) {
						perimeter-=2;
						if(j>0 && arr[i][j-1]==1 ) {
							perimeter-=2;		
							}
					}
				}
			}
		}
		System.out.println(perimeter);
	}
}
