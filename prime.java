import java.util.Scanner;
class prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int temp=0;
System.out.print("enter a number:");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
if(n%1==0 && n%i==0 && n%2!=0)
{
temp=i;
}
else
{
continue;
}
}
if(temp==n)
{
System.out.print(n+" is a prime number");
}
else
{
System.out.print(n+" is  not a prime number");
}
}
}