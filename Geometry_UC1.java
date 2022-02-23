/********************************************************************
 * Purpose : to calculate length of line using cartesian system.
 **********************************************************************/
package geometryoops;
import java.util.Scanner;
public class Geometry_UC1 {
	/*
	 * method to find length of line
	 * @param x1 x co-ordinate of A
	 * @param y1 y co-ordinate of A
	 * @param x2 x co-ordinate of B
	 * @param y2 y co-ordinate of B
	 */
	    public double lengthcheck(double x1,double y1,double x2,double y2) {
		double a = (double)Math.pow((x2-x1),2);
		double b = (double)Math.pow((y2-y1),2);
		double lengthofLine = Math.pow((a+b),0.5);

		return lengthofLine;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x co-ordinate of A");
		double x1 = sc.nextInt();
		System.out.println("Enter y co-ordinate of A");
		double y1 = sc.nextInt();
		System.out.println("Enter x co-ordinate of B");
		double x2 = sc.nextInt();
		System.out.println("Enter y co-ordinate of B");
		double y2 = sc.nextInt();
		//input taken
		
		Geometry_UC1 lengthcheck1 = new Geometry_UC1(); // new object
		double lengthofLine = lengthcheck1.lengthcheck(x1,y1,x2,y2); //called method
		System.out.println(lengthofLine);
		sc.close();

	}

}
