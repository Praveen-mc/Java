package placement;
import java.util.*;
class Solution{
	public void rotate(int[] nums,int r) {
		r%=nums.length;
		rotate(nums,0,nums.length-1);
		rotate(nums,0,r-1);
		rotate(nums,r,nums.length-1);	
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}
	private int[] rotate(int[] nums,int low,int high) {
		while(low<high) {
			int temp=nums[low];
			nums[low]=nums[high];
			nums[high]=temp;
			low++;
			high--;
		}
		return nums;

	}

	
}
public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		Solution sc=new Solution();
		int k=obj.nextInt();
		obj.close();
		int arr[]= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		sc.rotate(arr,k);

	}

}
