import java.util.Scanner;
class choice
{
public static void main(String[] args)
{
int op,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter you choice");
op=sc.nextInt();
switch(op)
{
case 1:
System.out.println("enter a string:");
String s=sc.next();
StringBuffer num=new StringBuffer();
int len=s.length();
for(int i=(len-1);i>=0;i--)
num=num.append(s.charAt(i));
         if(s.equalsIgnoreCase(num.toString()))
                              System.out.println(" a palindrome");
        else
                            System.out.println("not a palindrome");
break;
case 2:
System.out.println("enter a number");
n=sc.nextInt();
int r, sum=0,temp;
temp=n;
while(n>0)
{
r=n%10;
n=n/10;
sum=(sum*10)+r;
}
if(temp==sum)
{
System.out.println(sum+"is palindrome number");
}
else
{
System.out.println(sum+"is not  palindrome number");
}
break;
}
}
}