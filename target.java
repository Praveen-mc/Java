package placement;
import java.util.*;
public class target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int target=sc.nextInt();
		int flag=0;
		int arr[]= {4,5,6,7,0,1,2};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				 flag=1;
				 System.out.println(i);
			}	
			
		}
		if(flag==0) {
			System.out.println(-1);
		}
		
		
	}

}
