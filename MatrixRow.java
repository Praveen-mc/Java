//package placement;
import java.util.*;
public class MatrixRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=2;
		int col=2;
		int arr[][]=new int[row][col];
		int sum=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
			{
				sum+=arr[i][j];
				//System.out.print(arr[i][j]);
			}
			System.out.println("The Sum of row "+sum);
			sum=0;
		}
		

	}

}
