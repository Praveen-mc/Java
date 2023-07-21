package placement;

import java.util.Scanner;

public class StrConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='a'||arr[i]=='A'||arr[i]=='e'||arr[i]=='E'||arr[i]=='i'||arr[i]=='I'||arr[i]=='o'||arr[i]=='O'||arr[i]=='u'||arr[i]=='U') {
				continue;
			}
			else {
				System.out.print(arr[i]);
			}
			
			
		}
			

	}

}
