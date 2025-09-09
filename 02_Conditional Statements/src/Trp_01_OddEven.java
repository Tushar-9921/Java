import java.util.Scanner;

public class Trp_01_OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To check Odd Or Even Number Calculator: ");

        System.out.print("Enter Your Number: ");
        int number = sc.nextInt();

        if(number%2 == 0) {
            System.out.println("Your Number is Even");
        } else {
            System.out.println("Your Number is Odd");
        }
    }
}