package javaprogrammesweek2;

/**
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Programme_1 { //Class declaration
    int var1 = 10;
    int var2 = 20;

    public static void main(String[] args) { //main method
        Programme_1 obj = new Programme_1();
        obj.myMethod();
    }

    public void myMethod() { //user defined method to display output
        System.out.println(var1 + " and " + var2);

    }
}



