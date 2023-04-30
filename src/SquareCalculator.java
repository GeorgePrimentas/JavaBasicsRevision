// The next line defines a new class called "SquareCalculator"
public class SquareCalculator {
    // The next line defines a new method called "main"
    public static void main(String[] args) {
        // Double (precise value decimal) variables width and height are declared
        double width, height;
        // The above variables are initiated
        width = 13.5d;
        height = 25.3;
        // Double (precise value decimal) variable perimeter declared
        double perimeter;
        // The perimeter variable is initiated
        perimeter = (width + height) * 2;
        // It is assumed that the units given are centimetres
        // The next two lines display the width and height of the rectangle to the console
        System.out.println("The width of the rectangle is: " + width + " cm." );
        System.out.println("The height of the rectangle is: " + height + " cm." );
        // The perimeter of the rectangle is displayed in centimetres to the console.
        System.out.println("The perimeter of the rectangle is: " + perimeter + " cm.");
    }
}
