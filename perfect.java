import java.util.Scanner;
public class perfect
{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter no.of perfect numbers you want print:--");
try{
 int a=s.nextInt();
 int i,x=0,j;
 if(a==0)
 {
 System.out.println("The result is-: 0");
 }
 else if(a>0)
 {
 int b=0;
 for(j=2;j<100000000;j++)
 {
 if(b<a) 
 x=1;
 for(i=2;i<j;i++)
 {
 if(j%i==0)
 {
 x=x+i;
 }
 }
 if(x==j)
 {
 System.out.print(","+j);
 b=b+1;
 }
 }
 }
 else 
 {
 System.out.println("Invalid");
 }
}
catch(Exception e)
{
 System.out.println("Invalid");
}
}
}