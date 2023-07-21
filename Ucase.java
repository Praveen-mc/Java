package placement;
import java.util.*;
public class Ucase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if((arr[i]>=65 && arr[i]<=91)) {
				System.out.print(arr[i]);
			}
		}
		

	}

}
