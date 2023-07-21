import java.util.*;
class prime{
public static void main(String args[])
{
int num=20,i,count=0;
for(i=1;i<=num;i++)
{
count=0;
for(int j=2;j<=i/2;j++)
{
count++;
break;
}
}
if (count==0){
System.out.println(i);
}
}
}
