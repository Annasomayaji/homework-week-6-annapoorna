package javaprogrammesweek2;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme
 */

public class Programme_3 { //Class declaration
    int var1 = 10;
    static int var2 = 20;

    public static void main(String[] args) { //main method
        Programme_3 obj2 = new Programme_3(); //object instantiation
        obj2.myMethod1();
        myMethod2();
    }

    public void myMethod1() { //Instance method

        System.out.println("Instance variable " + var1);
        System.out.println("Static variable " + var2);
    }

    public static void myMethod2() { //Static method
        Programme_3 obj1 = new Programme_3();

        System.out.println("Instance variable " + obj1.var1);
        System.out.println("Static variable " + var2);
    }

}
