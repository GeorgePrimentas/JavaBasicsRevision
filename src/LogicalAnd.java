// Defines a new class called "LogicalAnd"
public class LogicalAnd {
    // Defines a new method called "main"; entry point of the program
    public static void main(String[] args) {
        // Displays text in quote marks on the console
        System.out.println("Is number between 25 AND 40?");
        // Declares an integer variable called "number" and initiates
        // it with the value of 25
        int number = 25;
        // Compares the number variable with 25 AND (&&) 40 and
        // if it's greater than 25 AND less than 40
        // in other words if the number is between 25 and 40,
        // it executes code in the curly braces
        if (number > 25 && number < 40) {
            // Displays text in quote marks on the console
            System.out.println("Yes! :)");
        } else // In any other case, it executes code in the
        // next pair of curly braces
        {
            // Displays text in quote marks on the console
            System.out.println("Nope :(");
        }
    }
}
