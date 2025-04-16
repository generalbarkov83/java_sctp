// package 06-scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

        // Scanner class
        // class => is a container that can have data and methods (aka functions)
        //before we can use a class, we must create an INSTANCE of a class
        // New 'Scanner' => create a new instance of the Scanner class (aka object)
        Scanner sc = new Scanner(System.in); // System.in ==> keyboard
        String firstName = sc.next(); // .next() ask the user for a string and return it
                                      // it will stop at the first whitespace (tab, newline, space)
        System.out.println("Welcome, " + firstName);

        // when you use .next(), the ENTER char is still in the keyboard buffer
        //clear the keyboard buffer
        sc.nextLine();

        System.out.println("Enter your address: ");
        String address = sc.nextLine(); // capture inout as string up to the end of the line (ENTER)
        System.out.println("You stay at " + address);

        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Your age is: " + age);

        //basically, after a .next, .nextInt or .nextDouble etc etc, you need to clear the keyboard buffer
    }
    
}
