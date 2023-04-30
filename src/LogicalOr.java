// Defines a new class called "LogicalOr"
public class LogicalOr {
    // Defines a new method called "main"; entry point of the program
    public static void main(String[] args) {
        // Displays text in quote marks on the console
        System.out.println("Is the number less than 100 OR greater than 200?");
        // Declares an integer variable called "number" and initiates
        // it with the value of 200
        int number = 145;
        // Compares the number variable with 100 and 200 and
        // if it's less than 100 OR (||) greater than 200
        // in other words if the number is NOT between 100 and 200,
        // it executes code in the curly braces
        if (number < 100 || number > 200)
            // Displays text in quote marks on the console
        {
            System.out.println("Yes! :)");
        } else // In any other case, (i.e. if the number is in the range
            // (between) 0 and 100 it executes code in the next pair of curly braces
        {
            // Displays text in quote marks on the console
            System.out.println("Nope :(");
        }
    }
}
