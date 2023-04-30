// Defines a new class called "LogicalNot"
public class LogicalNot {
    // Defines a new method called "main"; entry point of the program
    public static void main(String[] args) {
        // Displays text in quote marks on the console
        System.out.println("Is the string equal to 'olive oil'?");
        // Declares a String variable called "text" and initiates
        // it with the value of "water"
        String text = "juice";
        // If the text is NOT (!) equal (equals() method)  to 'olive oil'
        if(!(text.equals("olive oil"))) {
            // Displays text in quote marks on the console
            System.out.println("No!");
        } else // In any other case, (i.e. if the text is equal to 'olive oil')
        // it executes code in the next pair of curly braces
        {
            // Displays text in quote marks on the console
            System.out.println("Yes");
        }
    }
}