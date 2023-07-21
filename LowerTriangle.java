package placement;

import java.util.Scanner;

public class LowerTriangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
			{
				if(i<j) {
				System.out.print("0 ");
				}
				else
					System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}

	}


}
