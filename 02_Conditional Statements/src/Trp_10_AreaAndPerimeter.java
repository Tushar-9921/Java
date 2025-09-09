import java.util.Scanner;

public class Trp_10_AreaAndPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Taking input
        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = input.nextDouble();

        // Calculating area and perimeter
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        // Output results
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

        // Comparing area and perimeter
        if (area > perimeter) {
            System.out.println("Area is greater than the perimeter.");
        } else if (area == perimeter) {
            System.out.println("Area is equal to the perimeter.");
        } else {
            System.out.println("Area is less than the perimeter.");
        }
    }
}
