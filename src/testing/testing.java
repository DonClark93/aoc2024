// Package declaration (optional, but if present, must be the first line)
package testing;

/* Import statements (if any)
import java.util.Scanner;
import java.io.*;
*/

public class testing {

    /* Class variables (fields)
    private int someVariable;
    static String = "Name";
    public static final double SOME_CONSTANT = 3.14;
    */
    public static String name = "Don";
    /* Constructor(s)
    public ClassName() {
        // Constructor body
        someVariable = 0;
    }
    */

    /*
    Static methods can be called without creating objects
    Public methods must be called by creating objects
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
