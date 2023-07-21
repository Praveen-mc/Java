package placement;
import java.util.*;
public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		sc.close();
		char rev[]=s1.toCharArray();
		for(int i=rev.length-1;i>=0;i--) {
			System.out.print(rev[i]);
		}

	}

}
