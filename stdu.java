import java.util.Scanner;
class stdu
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int tot,staff,student,x,y;
System.out.println("Total users:");
tot=sc.nextInt();
System.out.println("Staff");
staff=sc.nextInt();
if(tot<=0||staff<0||tot<staff||tot==staff)
{
System.out.println("Invalid");
return;
}
x=staff/3;
y=staff+x;
student=tot-y;
System.out.println("Student users:"+student);
}
}

