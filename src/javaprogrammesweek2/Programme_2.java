package javaprogrammesweek2;

/**
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */

public class Programme_2 { //Class declaration
    static int var1 = 10, var2 = 20;

    public static void main(String[] args) { //main method
        myMethod();
    }

    public static void myMethod() { //user defined method to display output

       System.out.println(var1 + " and " + var2);

    }
}
