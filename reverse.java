import java.util.Scanner;
class reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:");
String a=sc.nextLine();
StringBuffer num=new StringBuffer();
int len=a.length();
for(int i=len-1;i>=0;i--)
{
num=num.append(a.charAt(i));
}
System.out.println("Reverse of string is:"+num.toString());
}
}
