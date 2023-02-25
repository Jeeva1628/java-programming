import java.util.Scanner;
class SUM
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter N value: ");
int size=sc.nextInt();
System.out.println("enter the number:");
int num=sc.nextInt();
int sum=0;
int res=0;
for(int i=0;i<=size;i++)
{
sum++;
res=sum*2;
}
System.out.println("Sum of elements: "+res);
}                                                                  
}