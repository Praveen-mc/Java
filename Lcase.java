package placement;

import java.util.Arrays;
import java.util.Scanner;

public class Lcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
		char temp1[]= new char[arr.length];
		for(int i=0;i<arr.length;i++) {
			if((arr[i]>=97 && arr[i]<=122)) {
				temp1[i]=arr[i];
			}
		}
		Arrays.sort(temp1);
		for(char ele:temp1) {
			System.out.print(ele);
		}

	}

}
