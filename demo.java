import java.util.Scanner;
class demo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter 1st string:");
String s1=sc.nextLine();
System.out.println("enter 2nd string:");
String s2=sc.nextLine();
if(s1.length()==s2.length())
{
char[] chararray1=s1.toCharArray();
char[] chararray2=s2.toCharArray();
array.sort(charArray1);
array.sort(charArray2);
}
boolean result=array.equals(charArray1,charArray2);
if(result)
{
System.out.println(s1+"and"+s2+"are anagram");
}
else
{
System.out.println(s1+"and"+s2+"are not anagram");
}
}
}


