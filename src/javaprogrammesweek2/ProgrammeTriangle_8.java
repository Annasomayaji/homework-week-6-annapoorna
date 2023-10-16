package javaprogrammesweek2;

import java.util.Scanner;

public class ProgrammeTriangle_8 { //class declaration
    public static void main(String[] args) { //main method
        Scanner scanner = new Scanner(System.in);//Instantiate Scanner object
        System.out.println("Enter the base of the triangle in cm:");
        int base = scanner.nextInt();
        System.out.println("Enter the height of the triangle in cm:");
        int height = scanner.nextInt();

        ProgrammeTriangle_8 obj = new ProgrammeTriangle_8(); //Instantiate class object
        obj.areaCalculator(base, height); //call the area calculator method
        scanner.close(); //close scanner object
    }

    //method to calculate the area of triangle
    public void areaCalculator(int b, int h) {
        int area = (b * h) / 2;
        System.out.println("The area of the triangle is: " + area + " cm2");
    }
}
