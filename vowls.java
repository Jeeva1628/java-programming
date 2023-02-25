import java.util.Scanner;
class vowls
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int vcount=0,ccount=0;
System.out.println("Enter the string:");
String str=s.nextLine();
str=str.toLowerCase();
System.out.print("vowels:");
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
{
vcount++;
char v=str.charAt(i);
System.out.print(v);
}
}
System.out.print("\n No of vowels:"+vcount);
System.out.print("\nconsonants:");
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)!='a'&&str.charAt(i)!='e'&&str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u')
{
ccount++;
char c=str.charAt(i);
System.out.print(c);
}
}
System.out.print("\n No of consonants:"+ccount);
}
}

