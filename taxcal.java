import java.util.Scanner;
class tax
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter income:");
int in=sc.nextInt();
int temp,tax;
if(in<=250000)
{
System.out.println("no tax");
}
else if(in>250000 && in<=500000)
{
temp=in-250000;
tax=(temp*10)/100;
System.out.println("tax:"+tax);
}
else if(in>500000 && in<=1000000)
{
temp=in-250000;
tax=(temp*20)/100;
System.out.println("tax:"+tax);
}
else
{
temp=in-250000;
tax=(temp*30)/100;
System.out.println("tax:"+tax);
}
}
}



