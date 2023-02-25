import java.util.Scanner;
class compo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter range1:");
int r1=sc.nextInt();
System.out.print("enter range2:");
int r2=sc.nextInt();
System.out.print("composite numbers:");
for(int i=r1;i<=r2;i++)
{
for(int j=1;j<=i;j++)
if(i%j==0&&i%1==0)
{
 System.out.print(" ");
}
else
{
System.out.print(" "+i);
}
}
}
}

