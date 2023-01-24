import java.util.Scanner;
class pascal{
public static void main(String[] args)
{
int i,j,n,space;
Scanner s=new Scanner(System.in);
System.out.println("input the number of n:");
n=s.nextInt();
for(i=0;i<n;i++){
for(space=n;space>i;space--)
{
System.out.print(" ");
}
int num=1;
for(j=0;j<=i;j++){
System.out.print(num+" ");
num=num*(i-j)/(j+1);
}
System.out.println();
}
}
}