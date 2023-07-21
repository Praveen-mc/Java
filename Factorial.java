package placement;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int factorial=fact(n);
		System.out.println(factorial);
	}
	public static int fact(int num) {
		if(num==0 || num==0) {
			return 1;
		}
		else {
			return num*fact(num-1);
		}
	}

}
