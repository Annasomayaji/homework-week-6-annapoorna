package javaprogrammesweek2;

/**
 * Write a Java program to swap two variables.
 */

public class ProgrammeSwap_15 {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int z;
        System.out.println("");
        System.out.println("Before swap x = " + x + " and y = " + y);
        z = x;
        x = y;
        y = z;
        System.out.println("After swap x = " + x + " and y = " + y);
    }
}
