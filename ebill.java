/*EX NO : 1 PROGRAM TO GENERATE ELECTRICITY BILL

AIM
To develop a Java application to generate Electricity bill.

PROCEDURE
1.Create a class with the following members
Consumer no., consumer name, previous month reading, current month reading, type of EB
connection (i.e domestic or commercial)
2.Compute the bill amount using the following tariff.
If the type of the EB connection is commercial, calculate the amount to be paid as follows:
 First 100 units - Rs. 2 per unit
 101-200 units - Rs. 4.50 per unit
 201 -500 units - Rs. 6 per unit
 > 501 units - Rs. 7 per unit
3. Create the object for the created class .Invoke the methods to get the input from the consumer
and display the consumer information with the generated electricity bill.

PROGRAM*/
import java.util.*;
class ebill
{
public static void main (String args[])
{
customerdata ob = new customerdata();
ob.getdata();
ob.calc();
ob.display();
}
}
class customerdata
{
Scanner in = new Scanner(System.in);
Scanner ins = new Scanner(System.in);
String cname;
int bn;
double current,previous,tbill,units;
void getdata()
{
System.out.println("\t\t\tCOMMERCIAL\t\t\t");
System.out.println("\t\t\t**********\t\t\t");
System.out.print ("\n\t Enter consumer number ");
bn = in.nextInt();
System.out.print ("\n\t Enter consumer name ");
cname = ins.nextLine();
System.out.print ("\n\t Enter previous month reading ");
previous= in.nextDouble();
System.out.print ("\n\t Enter current month reading ");
current= in.nextDouble();
}
void calc()
{
units=current-previous;
if (units<=100)
tbill= 2.50 * units;
else if(units>100 && units<=200)
tbill=5*units;
else if(units>200 && units<=500)
tbill= 6.50*units;
else
tbill= 9*units;
}
void display()
{
System.out.println("\n\t Consumer number = "+bn);
System.out.println ("\n\t Consumer name = "+cname);
System.out.println ("\n\t type of connection = COMMERCIAL ");
System.out.println ("\n\t Current Month Reading = "+current);
System.out.println ("\n\t Previous Month Reading = "+previous);
System.out.println ("\n\t Total units = "+units);
System.out.println ("\n\t Total bill = RS "+tbill);
}
}

