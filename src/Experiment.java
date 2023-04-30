import java.util.Scanner;

public class Experiment {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.print("Hello");
        System.out.println(" & Goodbye");
        Boolean variableName = Boolean.parseBoolean(input.next());
        System.out.println(variableName);
    }

}


// // GUI
//import javax.swing.*;
//class gui{
//    public static void main(String args[]){
//        JFrame frame = new JFrame("My First GUI");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(300,300);
//        JButton button = new JButton("Press");
//        frame.getContentPane().add(button); // Adds Button to content pane of frame
//        frame.setVisible(true);
//    }
//}