package Triangle;

import java.util.Scanner;

public class TriangleAreaCalculation {

    // Method to check if the year is a leap year
    public void checkLeapYear() {
        Scanner scanner = new Scanner(System.in);
        //prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeap) {
            System.out.println("The year you entered is a leap year.");
        } else {
            System.out.println("The year you entered is not a leap year.");
        }
    }

    // Method to prompt the user to enter the base and height of the triangle
    public double[] getBaseAndHeight() {
        Scanner scanner = new Scanner(System.in);
        double[] baseAndHeight = new double[2];

            //Ask user to enter the base of triangle
        System.out.print("Enter the base of the triangle: ");
        baseAndHeight[0] = scanner.nextDouble();

        //Ask user to enter the height of triangle
        System.out.print("Enter the height of the triangle: ");
        baseAndHeight[1] = scanner.nextDouble();

        return baseAndHeight;
    }

    // Method to compute the area of the triangle
    public double computeArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to output the calculated area of the triangle
    public void displayArea(double area) {
        System.out.println("The area of the triangle is: " + area);
    }

    public static void main(String[] args) {
        TriangleAreaCalculation calculator = new TriangleAreaCalculation();

        // Check leap year
      calculator.checkLeapYear();

        // Get base and height
        double[] baseAndHeight = calculator.getBaseAndHeight();
        // Compute the area
        double area = calculator.computeArea(baseAndHeight[0], baseAndHeight[1]);

        // Display the area
        calculator.displayArea(area);
    }
}