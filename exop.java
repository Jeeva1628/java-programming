import java.util.Scanner;
class exop
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the a:");
int a=sc.nextInt();
System.out.print("Enter the b:");
int b=sc.nextInt();
System.out.print("Enter the choice:");
int ch=sc.nextInt();
int s;
if(ch==1)
{
 s=a+b;
System.out.print("Sum:"+s);
}
else if(ch==2)
{
s=a-b;
System.out.print("Difference:"+s);
}
else if(ch==3)
{
s=a*b;
System.out.print("Product:"+s);                                                            
}
else if(ch==4)
{
if(b==0)
{
System.out.print("Arithmetic exception");
}
else
{
s=a/b;
System.out.print("Division:"+s);
}
}
else
{
System.out.print("Invalid");
}
}
}
