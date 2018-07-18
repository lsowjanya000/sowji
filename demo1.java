import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class demo1
{
public static void main(String args[])
{
Pattern p=Pattern.compile("[a-zA-Z0-9]*@[a-zA-z]*[.][a-z]*");
Matcher m=p.matcher("sowjanyavarma19@siet.com");
while(m.find())
{
System.out.println(m.group());
}
}
}

