import java.util.Scanner;

public class Trp_05_AreaOfCircle {
    public static void main(String[] args) {
        // Formula = pi * r * r
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Radius: ");
        int radius = input.nextInt();
        float pi = 3.1415f;

        float aoc = pi * radius * radius;

        System.out.println("Your Area Of Circle is: " + aoc);

    }
}
