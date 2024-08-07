//Write a java Program to find Area of Square using Scanner Class
import java.util.Scanner;
class AreaOfSquare2
{
	public static void main(String args[])
	{
		int s,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side value: ");
		s=sc.nextInt();
		area=s*s;
		sc.close();
		System.out.println("Area is: "+area);
	}
}
