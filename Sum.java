package placement;
import java.util.*;

public class Sum {
    
    public static void main(String args[])  {
    	Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        sc.close();
        int c=0;
        for(int i=0;i<str1.length();i++)
        {
        if(str1.charAt(i)!=str2.charAt(i))
        {
        	c++;
        }
        }
        System.out.println(c);
    }
}
