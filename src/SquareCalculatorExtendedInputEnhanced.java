// Imports the Scanner class from the java.util package/library
import java.util.Scanner;

// The next line defines a new class called "SquareCalculatorExtendedInputEnhanced"
public class SquareCalculatorExtendedInputEnhanced {
    // The next line defines a new method called "main"
    public static void main(String[] args) {
        // Creates a new Scanner object
        Scanner input = new Scanner(System.in);
        // Displays message on the console to instruct the user what to input
        System.out.println("Please type the width of the rectangle: ");
        // Expects input from the user and then declares a double variable
        // called "width" and initiates it with the string input from the user
        // converted (with parse) to a double value
        double width = Double.parseDouble(input.next());
        // Displays message on the console to instruct the user what to input
        System.out.println("Please type the height of the rectangle: ");
        // Expects input from the user and then declares a double variable
        // called "height" and initiates it with the string input from the user
        // converted (with parse) to a double value
        double height = Double.parseDouble(input.next());
        // Double (precise value decimal) variable perimeter declared
        double perimeter;
        // The perimeter variable is initiated
        perimeter = (width + height) * 2;
        // Double (precise value decimal) variable perimeter declared
        double area;
        // The area variable is initiated
        area = width * height;
        // It is assumed that the units given are centimetres
        // The next two lines display the width and height of the rectangle to the console
        System.out.println("The width of the rectangle is: " + width + " cm." );
        System.out.println("The height of the rectangle is: " + height + " cm." );
        // The perimeter of the rectangle is displayed in centimetres to the console.
        System.out.println("The perimeter of the rectangle is: " + perimeter + " cm.");
        // The area of the rectangle is displayed in square centimetres to the console.
        System.out.println("The area of the rectangle is: " + area + " cm2.");
    }
}
