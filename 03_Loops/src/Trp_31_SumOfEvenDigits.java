import java.util.Scanner;

public class Trp_31_SumOfEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Calculate sum of Even digits Calculator: \n");

        System.out.print("Enter Your Number: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n > 0) { // (n != 0)
//            int lastDigit = n%10;
            if(n%2 != 0) {
                sum = sum + (n%10);
            }
            n = n / 10;
        }
        System.out.print("Your Sum of Even Digits is: " + sum);
    }
}
