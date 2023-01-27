import java.util.*;
class fibo
{
public static void main(String[] arg)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number:");
    int num=sc.nextInt();
    int n1=0,n2=1,n3;
    System.out.print(n1 +" "+n2);
    for(int i=1;i<=num;i++)
   {
       n3=n1+n2;
       if(n3%2==0)
       {
          System.out.print(" "+n3+" ");
        }
       n1=n2;
       n2=n3;
   }
}
}