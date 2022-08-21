//Navid-Derakhshandeh
package second;

import java.util.Scanner;

public class Euler 
{
	public void calculation()
	{	
	for(int i = 0; i < 100000; i++)
	{
		System.out.println("Please Enter Time : ");
		Scanner reader = new Scanner(System.in);
		double x = reader.nextDouble();
		
		System.out.println("Please Enter your point number : ");
		Scanner reader1 = new Scanner(System.in);
		double y = reader.nextDouble();
		
		double z = 0.2 * y;

		double e = 1 - x;

	    double s = e / 100;

		double a = z * s;

	    double r = a * x;

		double b = y + r;
		
		System.out.println("Your Next Point Number is : \n " + b);
	}
  }
}

