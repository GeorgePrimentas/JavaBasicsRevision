// Imports the Scanner class for java.util
import java.util.Scanner;

// Defines a new class called "NameAndAgeGreeting"
public class NameAndAgeGreeting {
    // Defines a new method called "main"
    public static void main(String[] args) {
        // Creates a new Scanner object
        Scanner reader = new Scanner(System.in);
        // Prints message on the console to instruct the user what to input
        System.out.println("What is your name? ");
        // Expects user's input (blinking I-beam cursor) with input.next()
        // Declares a String variable (called "name") and initiates it with
        // the value after the assignment operator (=); (whatever the user has input)
        String name = reader.nextLine();
        // Prints message on the console to instruct the user what to input
        System.out.println("What is your age? ");
        // Expects user's input (blinking I-beam cursor) with input.next()
        // Declares an integer variable (called "age") and initiates it with
        // the value after the assignment operator (=); (whatever the user has input)
        // parseInt method converts its parameter (input.next()) to an integer
        int age = Integer.parseInt(reader.nextLine());

        // Prints message/greeting on the console
        System.out.println("Your name is " + name + " and you are " + age + " years old, nice to meet you!");

    }
}
