import java.util.Scanner;
class avg
{
public static void main(String[] args)
{
try{
Scanner s=new Scanner(System.in);
int v2=0;
double as,ab;
int u1=0,u2=0,i1=0,i2=0;
System.out.println("Enter an number:");
int v=s.nextInt();
if(v==-1)
{
break;
}
while(v2!=1)
{
if(v>=0)
{
u1=u1+v2;
i1=i1+1;
}
else
{
u2=u2+v2;
i2=i2+1;
}
}
as=(u2/i2);
ab=(u1/i1);
System.out.println("Total avg of -num"+as);
System.out.println("Total avg of +num"+ab);
}
catch(Exception e)
{
System.out.println("Invalid");
}
}
}
