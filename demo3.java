import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class demo3
{
public static void main(String args[])
{
Pattern p=Pattern.compile("[a-z]*[.][a-z]*[.][a-z]*[.][a-z]*");
Matcher m=p.matcher("gmail.com.co.in");
while(m.find())
{
System.out.println(m.group());
}
}
}

