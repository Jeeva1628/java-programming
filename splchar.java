import java.util.Scanner;
class splchar
{
public static void main(String[] args)
{
Scanner sc=new Scanner (System.in);
System.out.println("enter the string");
String str=sc.nextLine();
int count=0;
String s=str;
System.out.println("Special Characters in the string:");
for(int i=0;i<=s.length();i++)
{
if(s.charAt(i)=='!'||s.charAt(i)=='@'||s.charAt(i)=='#'||s.charAt(i)
=='$'||s.charAt(i)=='%'||s.charAt(i)=='^'||s.charAt(i)=='&'||s.charAt(i)=='*'||s.charAt(i)=='('||s.charAt(i)==')'||s.charAt(i)=='<'||s.charAt(i)=='>'||s.charAt(i)=='{'||s.charAt(i)=='}'||s.charAt(i)=='['||s.charAt(i)==']')
{
count++;
System.out.println(s.charAt(i)+" ");
}
else
{
continue;
}
}
System.out.println("No of special characters in the string:"+count);
}
}
