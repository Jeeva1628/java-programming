import java.util.Scanner;
class removedup
{
 static void removedup(char str[],int length)
{
int index=0;
for(int i=0;i<length;i++)
{
int j;
for(j=0;j<i;j++)
{
if(str[i]==str[j])
{
break;
}
}
if(j==i)
{
str[index++]=str[i];
}
}
System.out.println("length of string after removing duplicate values: "+index);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:");
String name=sc.nextLine();
char str[]=name.toCharArray();
int len=str.length;
removedup(str,len);
}
} 