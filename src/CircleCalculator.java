// The next line defines a new class called "CircleCalculator"
public class CircleCalculator {
    // The next line defines a new method called "main"
    public static void main(String[] args) {
        // declare/initiate the variable circleRadius with value 12.0 (cm)
        double circleRadius = 12.0;
        // declare/initiate the variable circleDiameter
        double circleDiameter = circleRadius * 2;
        // declare/initiate the variable pi (which in reality is a 'const(ant)')
        double pi = 3.14159;
        // declare/initiate the variable circleCircumference
        double circleCircumference = circleDiameter * pi;
        // declare/initiate the variable circleArea
        double circleArea = circleRadius * circleRadius * pi;
        // Display on the screen the above variables/calculations
        System.out.println("Given a circle has a radius of " + circleRadius + "cm, its:");
        System.out.println("Diameter is " + circleDiameter + " cm.");
        System.out.println("Circumference is " + circleCircumference + " cm.");
        System.out.println("Area is " + circleArea + " cm2.");
    }
}
