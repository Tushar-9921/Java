import java.util.Scanner;

public class Trp_29_SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Calculate sum of digits Calculator: \n");

        System.out.print("Please, Enter Your Number Here: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n > 0) { // (n != 0)
//            int lastDigit = n%10;
            sum = sum + (n%10);
            n = n/10;
        }
        System.out.print("Your Sum Of Digits is: " + sum);
    }
}
