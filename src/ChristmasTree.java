// Imports Scanner class (from java.util package)
import java.util.Scanner;
// The next line defines a new class called "ChristmasTree"
public class ChristmasTree {
    // The next line defines a new method called "main"
    public static void main(String[] args) {
        // Expecting user's input (blinking I-beam cursor)
        Scanner input = new Scanner(System.in);
        // Prints message on the console to instruct the user what to input
        System.out.print("How many rows do you want your tree to have? (minimum 3 - maximum 64): ");
        // Declares an integer variable (called numberOfRows) and initiates it with
        // the value after the assignment operator (=);
        // parseInt method converts its parameter (input.next()) to an integer
        byte numberOfRows = Byte.parseByte(input.next());
        // This parent loop prints a triangle made of asterisks (*)
        // So it's the 'foliage' of the tree without its trunk (single asterisk at the bottom)
        // The number of lines (rows) it prints is the user's input minus one (-1)
        for(byte i=1; i<numberOfRows; i++) {
            // The following nested loop creates the white space from the left side until the first
            // asterisk (of the row) appears)
            for(byte space=1; space<=numberOfRows-i-1; space++)
            {
                // Use of print (not println) so each new character goes next to the previous one,
                // in order to create the complete row
                System.out.print(" ");
            }
            // The following nested loop creates the asterisks (foliage) of the tree
            // It's increased by 2 (2*i) on every next row
            for (byte star=1; star<=2*i-1; star++)
            {
                System.out.print("*");
            }
            // Use of println to 'move' to the next row
            System.out.println();
        }
        // The following final loop creates the trunk of the tree (a single asterisk)
        for(byte space=1; space<=numberOfRows-2; space++)
        {
            System.out.print(" ");
        }
        System.out.print("*");
        // Optional line so that the prompt (%) symbol doesn't 'stick' next to the 'trunk'
        // if this program runs on the terminal
        System.out.println();
    }
}