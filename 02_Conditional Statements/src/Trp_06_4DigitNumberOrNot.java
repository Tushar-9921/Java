import java.util.Scanner;

public class Trp_06_4DigitNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number: ");
        int n = sc.nextInt();

        if(n > 999 && n < 10000) {
            System.out.print("It is 4 digit number");
        } else {
            System.out.print("It is not 4 digit number");
        }
    }
}
