import java.util.Scanner;
class sqpat{
public static void main(String[] args)
{
int i,j,n;
Scanner s=new Scanner(System.in);
System.out.println("input he number of n:");
n=s.nextInt();
for(i=1;i<=n;i++)
{
int num=i;
for(j=1;j<=i;j++)
{
int square=num*num;
System.out.print(" "+square);
}
System.out.println();
}
s.close();
}
}