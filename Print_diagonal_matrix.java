package Two_D_Array;
import java.util.Scanner;
public class Print_diagonal_matrix {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		char [][] arr=new char[n][n];
		for(int i=0;i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=sc.next().charAt(0);
			}
		}
		for(int i=0;i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j || i+j==n-1)
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
