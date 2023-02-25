import java.util.Scanner;
class primecom
{
public static void main(String[] args)
{
Scanner a=new Scanner(System.in);
System.out.println("Enter the size:");
System.out.println("Enter the elements:");
int n=a.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=a.nextInt();
}
int c1=0,prime=0,comp=0;
for(int i=0;i<n;i++)
{
c1=0;
for(int j=1;j<=arr[i];i++)
{
c1++;
}
}
if(c1==2)
{
prime++;
}
else if(c1>2)
{
comp++;
}
System.out.println("prime="+prime);
System.out.println("composite="+comp);
}
}