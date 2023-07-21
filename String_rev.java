package placement;
import java.util.*;
public class String_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String s1=sc.nextLine();
		String arr[]=s1.split(" ");
		int l=arr.length;
		for(int i=l-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
