import java.util.Scanner;
class power
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the number:");
int temp;
int num=sc.nextInt();
for(int i=1;i<num;i++){
temp=i*i*i;
if(temp==num)
{
System.out.println("true");
break;
}
else
{
System.out.println("false");
}
}
}
}