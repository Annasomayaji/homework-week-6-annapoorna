package javaprogrammesweek2;

import java.util.Scanner;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */

public class ProgrammeArithmetic_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Instantiate Scanner class object
        System.out.println("Enter the first number"); //read 2 numbers from console
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();

        //call methods to add, subtract, multiply, divide and find remainder
        toAdd(num1, num2); //calling static method
        toSubtract(num1, num2);//calling static method

        ProgrammeArithmetic_18 obj = new ProgrammeArithmetic_18();
        obj.toMultiply(num1, num2); //calling instance method
        obj.toDivideAndRemainder(num1, num2);//calling instance method

        scanner.close();
    }

    public static void toAdd(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Addition of " + num1 + " and " + num2 + " is: " + result);
    }

    public static void toSubtract(int num1, int num2) {
        int result;
        if (num1 > num2) { //check which number is bigger and subtract from the bigger number
            result = num1 - num2;
        } else {
            result = num2 - num1;
        }
        System.out.println("Subtraction of " + num1 + " and " + num2 + " is: " + result);

    }

    public void toMultiply(int num1, int num2) {
        int result = num1 * num2;
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + result);
    }

    public void toDivideAndRemainder(int num1, int num2) {
        float result;
        int remainder;
        if (num1 > num2) {  //check which number is bigger and divide the bigger number by smaller number
            result = (float) num1 / num2;//type casting
            remainder = num1 % num2;
        } else {
            result = (float) num2 / num1;
            remainder = num2 % num1;
        }

        System.out.println("Division of " + num1 + " and " + num2 + " is: " + result);
        System.out.println("Remainder of " + num1 + " and " + num2 + " is: " + remainder);

    }
}
