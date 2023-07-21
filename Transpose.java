package placement;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		int temp[][]=new int[row][col];
		try {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
			{
				temp[i][j]=arr[j][i];
			}
		}
		}
		catch(Exception e) {
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
			{
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
		}
	}

}
