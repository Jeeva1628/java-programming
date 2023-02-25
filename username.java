import java.util.Scanner;
class username
{
public static void main(String[] args)
{
Scanner sc=new Scanner (System.in);
System.out.print("enter the username:");
String user1=sc.nextLine();
System.out.print("reenter the username:");
String user2=sc.nextLine();
if(user2==user1)
{
System.out.println("username is valid");
}
else
{
System.out.println("username is invalid");
}
}
}