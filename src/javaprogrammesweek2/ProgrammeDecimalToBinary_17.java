package javaprogrammesweek2;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 *  Input a Decimal Number : 5
 *  Expected Output
 * Binary number is: 101
 */

public class ProgrammeDecimalToBinary_17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in); //Instantiate Scanner class object
        System.out.println("Enter a decimal number"); //prompt user to enter number in console
        int decimal=scanner.nextInt(); //read input from console
        convertToBinary(decimal); //call method to convert to binary
        scanner.close(); //Scanner object close
    }

    //static method to convert decimal to binary
    public static void convertToBinary(int d){
        String binary=Integer.toBinaryString(d);
        System.out.println("The binary number is: "+ binary);
    }
}
