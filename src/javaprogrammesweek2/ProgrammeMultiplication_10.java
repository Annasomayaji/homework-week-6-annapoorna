package javaprogrammesweek2;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 */
public class ProgrammeMultiplication_10 { //Declaration of class
    public static void main(String[] args) { //main method
        Scanner scanner = new Scanner(System.in); //Instantiate Scanner class object
        System.out.println("Please enter a number:");
        int num = scanner.nextInt(); //read input from console

        ProgrammeMultiplication_10 obj = new ProgrammeMultiplication_10();//Object instantiation
        obj.multiplication(num);
        scanner.close(); //close Scanner object
    }

    public void multiplication(int n) {

        for (int i = 1; i < 11; i++) {
            int result = n * i;
            System.out.println(n + " * "+ i + " = " + result);

        }

    }

}
