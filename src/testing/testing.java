// Package declaration (optional, but if present, must be the first line)
package testing;

/* Import statements (if any)
import java.util.Scanner;
import java.io.*;
*/

public class testing {

    /* Class variables (fields)
    private int someVariable;
    public static final double SOME_CONSTANT = 3.14;
    */
    public static String name = "Don";
    /* Constructor(s)
    public ClassName() {
        // Constructor body
        someVariable = 0;
    }
    */


    /* Methods
    public void someMethod() {
        // Method body
        System.out.println("Hello, World!");
    }
    */


    // Main method (optional, only if you want to run this class as an application)
    public static void main (String[] args){
        System.out.println("Hello World " + name);
    }
}
