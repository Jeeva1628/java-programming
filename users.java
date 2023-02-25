import java.util.Scanner;
class users
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int tot_user,staff_user,student_user,tot,non_tech;
System.out.println("total user:");
tot_user=s.nextInt();
System.out.println("staff user:");
staff_user=s.nextInt();
if(tot_user<=0 || staff_user<0 || tot_user<staff_user || tot_user==staff_user)
{
System.out.println("invalid user");
}
non_tech=staff_user/3;
tot=staff_user+non_tech;
student_user=tot_user-tot;
System.out.println("student users"+student_user);
}
}
