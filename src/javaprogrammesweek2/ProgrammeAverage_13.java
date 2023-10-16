package javaprogrammesweek2;

import java.util.Scanner;

public class ProgrammeAverage_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Instantiate Scanner class object
        //Read user inputs from console
        System.out.println("Please enter the 1st number:");
        int num1 = scanner.nextInt();
        System.out.println("Please enter the 2nd number:");
        int num2 = scanner.nextInt();
        System.out.println("Please enter the 3rd number:");
        int num3 = scanner.nextInt();

        avgCalculator(num1, num2, num3);//call the static user defined method
        scanner.close(); //close Scanner object
    }

    //static method to calculate the average
    public static void avgCalculator(int a, int b, int c) {
        float result = (float)(a + b + c) / 3; //type casting
        System.out.println("The average of numbers " + a + " , " + b + " , " + c + " is = " + result);
    }
}
