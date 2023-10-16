package javaprogrammesweek2;

import java.util.Scanner;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 * Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class ProgrammeRectangle_14 { //Class declaration
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner object instantiation
        System.out.println("Enter the width of the rectangle in cm");
        float width = scanner.nextFloat();
        System.out.println("Enter the height of the rectangle in cm");
        float height = scanner.nextFloat();

        ProgrammeRectangle_14 obj = new ProgrammeRectangle_14();
        obj.RectangleArea(width, height);
        scanner.close(); //close Scanner object
    }

    // Instance method
    public void RectangleArea(float w, float h) {
        float area = w * h;
        float perimeter = 2 * (w + h);
        System.out.println("The area of the rectangle is: " + String.format("%.2f", area) + " cm2");
        System.out.println("The area of the perimeter is: " + String.format("%.2f", perimeter) + " cm");
    }
}
