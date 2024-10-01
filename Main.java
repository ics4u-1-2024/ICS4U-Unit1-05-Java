/*
* The ...
*
* @author  Mr Coxall
* @version 1.0
* @since   2020-01-01
*/

import java.util.Scanner;

/**
* This ...
*/
final class Main {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // create a scanner object to get input
        Scanner scanner = new Scanner(System.in);

        scanner.close();
        System.out.println("\nDone.");
    }
}
