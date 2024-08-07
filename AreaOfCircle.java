//Write a java program to find Area of circle, to read data values by using scanner class
//a=pi*r*r C=2pr
import java.util.Scanner;
public class AreaOfCircle 
{
	public static void main(String args[])
	{
      		int radius;
      		double area;
      		Scanner sc = new Scanner(System.in);
      		System.out.println("Enter the radius of the circle ::");
      		radius = sc.nextInt();
      		area = (radius*radius)*Math.PI;
      		System.out.println("Area of the circle is ::"+area);
  	 }
}
