import java.util.Scanner;
class bank
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the depositor name:");
String name=sc.nextLine();
System.out.print("enter the account number:");
int acc=sc.nextInt();
System.out.print("enter the balance:");
int bal=sc.nextInt();
System.out.print("enter the amount to be deposited:");
int dep=sc.nextInt();
bal=bal+dep;
System.out.print("balance:"+bal);
System.out.print("\nenter the amount to be withdrawed:");
int withdraw=sc.nextInt();
bal=bal-withdraw;
if(bal<500)
{
System.out.println("Minimum balance must be Rs.500.00");
}
else
{
System.out.println("---------displaying bank accont details----------");
System.out.println("DEPOSITOR NAME:"+name);
System.out.println("ACCOUNT NUMBER:"+acc);
System.out.println("TYPE OF ACCOUNT:savings");
System.out.println("BALANCE:"+bal);
}
}
}



