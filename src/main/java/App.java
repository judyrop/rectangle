import models.Rectangle;

import java.io.Console;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the length of your rectangle:");
         int intLength = myScanner.nextInt();
//        String stringLength = myConsole.readLine();
////        int intLength = Integer.parseInt(stringLength);
        System.out.println("enter the width of your rectangle:");
        int intWidth = myScanner.nextInt();
//        String stringWidth = myConsole.readLine();
//        int intWidth = Integer.parseInt(stringWidth);
        Rectangle rectangle = new Rectangle(intLength,intWidth);
        boolean squareResult = rectangle.isSquare();
        System.out.println("Is your rectangle a square, too? " + squareResult + "!");
    }
}