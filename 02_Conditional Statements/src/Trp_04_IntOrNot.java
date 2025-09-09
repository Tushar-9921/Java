import java.util.Scanner;

public class Trp_04_IntOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Real Number Calculator: ");
        System.out.print("Enter Your Number: ");
        double num = input.nextDouble(); // 20.5

        int x = (int)num; // x = 20

        if (num - x == 0) { // 20.5 - 20 = .5 OR if(num == (int)num) OR (num%1 == 0)
            System.out.print("This Is an Integer");
        } else {
            System.out.println("It is Not an integer");
        }
    }
}
