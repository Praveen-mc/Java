package placement;

import java.util.Scanner;

public class DiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
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
				if(i==j) {
				sum+=arr[i][j];
				}
				else
					continue;
			}
			//System.out.println(sum);
		}
		System.out.println(sum);
		

	}
}
