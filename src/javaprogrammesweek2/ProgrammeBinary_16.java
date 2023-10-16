package javaprogrammesweek2;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */
public class ProgrammeBinary_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first binary number:");
        String binary1 = scanner.nextLine();//get inputs from console
        System.out.println("Enter the second binary number:");
        String binary2 = scanner.nextLine();
        addBinary(binary1, binary2); //call static method to add binary
        scanner.close();
    }

    //user defined static method to add binary numbers
    public static void addBinary(String b1, String b2) {
        int num1 = Integer.parseInt(b1, 2);
        int num2 = Integer.parseInt(b2, 2);

        int result = num1 + num2;
        String binaryResult = Integer.toBinaryString(result);
        System.out.println("Sum of two binary numbers: " + binaryResult);

    }
}
