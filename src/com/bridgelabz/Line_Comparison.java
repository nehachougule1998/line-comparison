package com.bridgelabz;
import java.util.Scanner;
public class Line_Comparison {

	public static void main(String[] args) { 
		System.out.println("welcome to line comparison computation program on master branch");
		Scanner ch = new Scanner(System.in);
		System.out.println("enter the coordinates of x1 & y1 : ");
		int x1 = ch.nextInt();
		int y1 = ch.nextInt();
		System.out.println("enter the coordinates of x2 & y2 : ");
		int x2 = ch.nextInt();
		int y2 = ch.nextInt();
                double length1 = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));

		System.out.println("enter the coordinates of x3 & y3 : ");
		int x3 = ch.nextInt();
		int y3 = ch.nextInt();
		System.out.println("enter the coordinates of x4 & y4 : ");
		int x4 = ch.nextInt();
		int y4 = ch.nextInt();
	        double length2 = Math.sqrt((x4-x3) * (x4-x3) + (y4-y3) * (y4-y3));
		
		System.out.println("first line length is : " + length1 );
		System.out.println("second line length is : " + length2 );
		   
		if(length1 == length2)
		    System.out.println("both lines are equal");
		else if(length1 > length2 )
				System.out.println("length of line1 is > than line2 ");
		else 
			 System.out.println("length of line1 is < than line2 " );
		}
   }          
			 












  


