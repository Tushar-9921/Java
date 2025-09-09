import java.util.Scanner;

public class Trp_10_SumOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your First Number: ");
        int firstNum = sc.nextInt();

        System.out.print("Enter Your Second Number: ");
        int secondNum = sc.nextInt();

        System.out.print("Enter Your Third Number: ");
        int thirdNum = sc.nextInt();

        int sum = firstNum + secondNum + thirdNum;

        System.out.print("Your Sum of Three Number Is: " + sum);
    }
}
