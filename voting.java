import java.util.Scanner;
class voting
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a age:");
int n;
int age=sc.nextInt();
if(age>=18)
{
System.out.println("eligible for voting");
}
else
{
System.out.println(" not eligible for voting");
n=18-age;
System.out.println("you can vote after "+n+" years");
}
}
}