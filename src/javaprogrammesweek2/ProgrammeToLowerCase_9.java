package javaprogrammesweek2;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class ProgrammeToLowerCase_9 { //Class declaration
    public static void main(String[] args) { //main method
        Scanner scanner = new Scanner(System.in); //Instantiate scanner class object
        System.out.println("Please write a sentence in UPPER CASE:");
        String str = scanner.nextLine(); //read input from console
        toLowerFromUpper(str); //call user defined method
        scanner.close(); //Close scanner object
    }

    //static method to convert from UPPER to lower case
    public static void toLowerFromUpper(String s) {
        String result = s.toLowerCase(); //method from String class
        System.out.println("Your message in lower case is: ");
        System.out.println("      " + result);
    }

}
