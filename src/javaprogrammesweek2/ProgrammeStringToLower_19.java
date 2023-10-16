package javaprogrammesweek2;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */

public class ProgrammeStringToLower_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Instantiate Scanner class object
        System.out.println("Please enter a sentence in upper case");
        String output = scanner.nextLine();
        String text = output.toLowerCase();
        System.out.println("The output in smaller case is:");
        System.out.println("       " + text);
        scanner.close();
    }
}
