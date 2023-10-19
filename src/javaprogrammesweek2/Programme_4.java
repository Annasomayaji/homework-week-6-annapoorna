package javaprogrammesweek2;

/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme
 */

public class Programme_4 { //class declaration
    static int var1 = 10, var2 = 20;
    int var3 = 30, var4 = 40;


    public static void main(String[] args) { // main method
        Programme_4 obj1 = new Programme_4(); //object instantiation
        obj1.myMethod1();
        myMethod2();
    }

    public void myMethod1() { //instance method
        System.out.println("I am printing from Instance method:");
        System.out.println("    Static variables are " + var1 + " and " + var2);
        System.out.println("    Instance variables are " + var3 + " and " + var4);
    }

    public static void myMethod2() { //static method
        Programme_4 obj2=new Programme_4();
        System.out.println("I am printing from static method:");
        System.out.println("    Static variable are " + var1 + " and " + var2);
        System.out.println("    Instance variable are " + obj2.var3 + " and " + obj2.var4);
    }


}
