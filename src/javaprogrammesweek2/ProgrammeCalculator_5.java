package javaprogrammesweek2;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods
 */

public class ProgrammeCalculator_5 { //class declaration

    public static void main(String[] args) { //main method
        //instantiating Scanner class
        Scanner scanner = new Scanner(System.in); //Instantiate Scanner class object
        System.out.println("Enter a number");
        int num1 = scanner.nextInt(); //read input from console
        System.out.println("Enter another number");
        int num2 = scanner.nextInt(); //read input from console

        //calling static methods
        addition(num1, num2);
        multiplication(num1, num2);

        //calling instance methods
        ProgrammeCalculator_5 obj = new ProgrammeCalculator_5();
        obj.subtraction(num1, num2);
        obj.division(num1, num2);

        //closing scanner
        scanner.close();
    }

    //declaration of user defined method for addition
    public static void addition(int a, int b) {
        int result = a + b;
        System.out.println("Sum of two numbers is: " + result);
    }

    //Instance method declaration for subtraction
    public void subtraction(int a, int b) {
        int result;
        if (a > b) {
            result = a - b;
        } else {
            result = b - a;
        }
        System.out.println("subtraction result: " + result);
    }

    //Static method declaration for multiplication
    public static void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("The multiplication of two numbers is : " + result);
    }

    //Instance method declaration for division
    public void division(int a, int b) {
        int result;
        if (a > b) {
            result = a / b;
        } else {
            result = b / a;
        }
        System.out.println("The division of two numbers is: " + result);
    }
}
