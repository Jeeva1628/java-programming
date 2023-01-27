import java.util.Scanner;
public class hollowsqrdollar
{
  private static Scanner sc;	
   public static void main(String[] args) 
{
    sc = new Scanner(System.in);		
    System.out.print("Enter Hollow Square Side = ");
    int side = sc.nextInt();
    System.out.print("Enter symbol = ");
    String sym= sc.next();	
    System.out.println("Printing Hollow Square Pattern");		
    for (int i = 0; i < side; i++ ) 
    {
     for (int j = 0 ; j < side; j++ ) 
      {
        if (i == 0 || i == side - 1 || j == 0 || j == side - 1) 
         {
	System.out.print(sym);
          }
        else 
          {
             	System.out.print(" ");
           }
	}
	System.out.println();
	}
       }
}