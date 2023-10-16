package javaprogrammesweek2;

import java.util.Scanner;//impost Scanner class
import java.lang.Math; //import Math class

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r)
 */

public class ProgrammeCircle_6 { //class declaration
    public static void main(String[] args) { //main method
        Scanner scanner = new Scanner(System.in); //create Scanner class object
        System.out.println("Enter the radius of the circle in cm: ");
        int radius = scanner.nextInt();

        calculateRadius(radius);//call the method to calculate the area of circle
        scanner.close();//closing scanner
    }

    //Calculate area of the circle
    public static void calculateRadius(int a) {
        double area = Math.PI * a * a;
        System.out.println("The area of the circle is: " + area + " cm2 ");
    }

}
