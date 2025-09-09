import java.util.Scanner;

public class Trp_28_CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to digit counter calculator: \n");

        System.out.print("Please, Enter Your Digits Here: ");
        int n = sc.nextInt();
        int count = 0;
        while(n > 0) {
            n = n / 10;
            count++;
        }
        System.out.print("Your Number Of digits are: " + count);
    }
}
