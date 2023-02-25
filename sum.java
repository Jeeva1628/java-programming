import java.util.Scanner;
class sum
{
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
System.out.println("enter the size: ");
int size= s.nextInt();
int[] array=new Int[size];
int sum=0;
System.out.println("enter the elements");
for(int i=0 ; i<size ; i++)
{
array[i]=s.nextInt();
sum=sum+array[i];
}
System.out.println("Elements"+array.toString(array));
System.out.println("Sum of elements: "+sum);
}                                                                  
}
