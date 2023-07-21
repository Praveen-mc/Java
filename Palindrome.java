package placement;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int flag=0;
		char arr[]=s1.toCharArray();
		char rev[]=new char[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=rev.length-1;j>=0;j--) {
				rev[i]=arr[j];
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				if(arr[i]==rev[j]) {
					flag=1;
				}
				else {
					flag=0;
				}
				
			}
		}
		if(flag==1) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("It is not palindrome");
		}
	}

}
