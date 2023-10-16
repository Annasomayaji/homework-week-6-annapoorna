package javaprogrammesweek2;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C)
 */

public class ProgrammeTemperature_7 { //class declaration

    public static void main(String[] args) { //main method
        Scanner scanner = new Scanner(System.in); //Instantiating Scanner class object
        System.out.println("Enter temperature in Fahrenheit");
        float temperature = scanner.nextFloat();

        ProgrammeTemperature_7 obj = new ProgrammeTemperature_7(); //Instantiate object of the class
        obj.temperatureCalculator(temperature);
        scanner.close(); //close the scanner
    }

    //Instance method to convert temperature to Celsius
    public void temperatureCalculator(float t) {
        float temp = ((t - 32) * 5 / 9);
        System.out.println("The temperature in  Celsius: " + temp + "C");
    }

}
