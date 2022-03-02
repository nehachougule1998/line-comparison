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
        double length = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
        System.out.println("length of line is : " + length );
   
		
	}

}
