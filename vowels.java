package placement;
import java.util.*;
public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char arr[]= {'a','A','e','E','i','I','o','O','u','U'};
		int c=0;
		for(int i=0;i<s.length();i++) {
			 for(int j=0;j<arr.length;j++) {
			 
			 
				 if(s.charAt(i)==arr[j]) {
					 c++;
				 }

	}
		}
	
			 System.out.println(c);
}
	
}


