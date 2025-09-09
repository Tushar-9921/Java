import java.util.Scanner;

public class Trp_09_SquareOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int n = sc.nextInt();
        int square=0;
        square = n * n;
        System.out.print("Your Square of " + n + " is: " + square); //2. direct print n * n
    }
}
