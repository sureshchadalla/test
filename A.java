//A.java
package Pack;
public class A
{
public void msg()
{
System.out.println("Hello");
}
}
//B.java
package MyPack;
import Pack.*;
class B
{
public static void main(String args[])
{
A obj = new A();
obj.msg();
}
}
