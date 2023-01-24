// 1
   2 2
   3 3 3
   4 4 4 4 //
import java.util.Scanner;
class numpat
{
public static void main(String[] args)
{
int i,j,n;
Scanner s=new Scanner(System.in);
System.out.println("input he number of n:");
n=s.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(i);
}
System.out.println(" ");
}
}
}