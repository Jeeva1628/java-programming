import java.util.Scanner;
class bin
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the decimal number:");
int n=sc.nextInt();
int r,m=1,s=0;
for(int i=0;i<=n;i++)
{
r=n%2;
n=n/2;
s=s+(r*m);
m=m*10;
}
System.out.println("binary:"+s);
}
}