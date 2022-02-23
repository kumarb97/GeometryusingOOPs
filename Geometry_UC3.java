/*************************************************************************
 * Purpose : To compare the lengths of two lines.
 ********************************************************************/
package geometryoops;
import java.util.Scanner;

public class Geometry_UC3 {
	/*
	 * method to compare two lengths of lines
	 * @param lengthofline1 length of line 1 
	 * @param lengthofline2 length of line 2
	 */
	
	public static void compare(double lengthofLine1,double lengthofLine2) {
		
		if(lengthofLine1 < lengthofLine2) {
		System.out.println("length of line 1 is smaller than length of line 2");
		}
		else if(lengthofLine1 == lengthofLine2) {
		System.out.println("length of line 1 is equal to length of line 2");
		}
		else {
		System.out.println("length of line 1 is greater than length of line 2");
		}
				
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
		System.out.println("Enter x co-ordinate of C");
		double x3 = sc.nextInt();
		System.out.println("Enter y co-ordinate of C");
		double y3 = sc.nextInt();
		System.out.println("Enter x co-ordinate of D");
		double x4 = sc.nextInt();
		System.out.println("Enter y co-ordinate of D");
		double y4 = sc.nextInt();
		// Input taken
		
		Geometry_UC1 length1 = new Geometry_UC1();  //created an object to calculate length of line 1
		double lengthofLine1 = length1.lengthcheck(x1,y1,x2,y2);
		Geometry_UC1 length2 = new Geometry_UC1();  //created an object to calculate length of line 2
		double lengthofLine2 = length1.lengthcheck(x3,y3,x4,y4);
		compare(lengthofLine1,lengthofLine2);
		sc.close();



	}

}
