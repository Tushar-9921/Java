import java.util.Scanner;

public class Trp_08_Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Take input from user
        System.out.print("Enter Your Radius: ");
        double radius = input.nextDouble();

        float pi = 3.1415f;

        double area = pi * radius * radius;
        System.out.print("Your Area is: " + area);
    }
}