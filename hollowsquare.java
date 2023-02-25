import java .util.Scanner;
class hollowsquare
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter side=");
int side =sc.nextInt();
for(int i=0;i<side;i++)
{
for(int j=0;j<i;j++)
{
if(i==0||i==side-1||j==side-1)
{
System.out.println("*"); 
}
else
{
System.out.println(" ");
}
}
System.out.println();
}
}
}