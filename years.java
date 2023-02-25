import java.util.Scanner;
class years
{
public static void main(String[] args){
int m,year,week,day;
Scanner s=new Scanner(System.in);
System.out.println("enter the number of days");
m=s.nextInt();
year=m/365;
m=m%365;
System.out.println("number of years:"+year);
week=m/7;
m=m%7;
System.out.println("number of weeks:"+week);
day=m;
System.out.println("number of days:"+day);
}
}