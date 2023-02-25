import java.util.Scanner;
class atm
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int total;
System.out.print("Enter the 1st denomination:");
int d1=sc.nextInt();
System.out.print("Enter the 1st denomination number of notes:");
int c1=sc.nextInt();
System.out.print("Enter the 2nd denomination:");
int d2=sc.nextInt();
System.out.print("Enter the 2nd denomination number of notes:");
int c2=sc.nextInt();
System.out.print("Enter the 3rd denomination:");
int d3=sc.nextInt();
System.out.print("Enter the 3rd denomination number of notes:");
int c3=sc.nextInt();
System.out.print("Enter the 4th denomination:");
int d4=sc.nextInt();
System.out.print("Enter the 4th denomination number of notes:");
int c4=sc.nextInt();
total=(d1*c1)+(d2*c2)+(d3*c3)+(d4*c4);
System.out.print("Total available balance in ATM:"+total);
}
}
