import java.util.*;
class spl
{
public static void  main(String[] args)
{
int count =0;
String s="!#java !!";
for(int i=0; i<s.length(); i++)
{
if((Character.isDigit(s.CharAt(i)))&&(Character.isLetter(s.CharAt(i)))&&(Character.isWhiteSpace(s.CharAt(i))))
{
count++;
}
}
if (count==0)
System.out.print("no.special characters");
else
System.out.print("special character found"+count);
}
}