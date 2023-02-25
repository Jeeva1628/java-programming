import java.util.Scanner;
class struplen
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string:");
String str=sc.nextLine();
String a=str.toUpperCase();
System.out.println("UpperCase:"+a);
int len=str.length();
System.out.println("Length:"+len);
System.out.print("Enter the word to be replaced:");
String re=sc.nextLine();
System.out.println("Enter the word to be replace:");
String n=sc.nextLine();
String sub=str.replace(re,n);
System.out.print("String after replacing:"+sub);
}
}

                                                                                                                      
