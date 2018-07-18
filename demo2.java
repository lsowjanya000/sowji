import java.io.*;
class demo2
{
public static void main(String args[])
{
pattern p=pattern.compile("a?");
matcher matcher=p.matcher("aaa");
while(m.find())
{
System.out.println(m.start()+"..."+m.end());
count++;
}
System.out.println(count);
}
}
