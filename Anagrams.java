package placement;
import java.util.*;
public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		char temp1[]=s1.toCharArray();
		char temp2[]=s2.toCharArray();
		Arrays.sort(temp1);
		Arrays.sort(temp2);
		s1=temp1.toString();
		s2=temp2.toString();
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("It is an anagram");
		}
		else {
			System.out.println("No");
		}
	}

}
