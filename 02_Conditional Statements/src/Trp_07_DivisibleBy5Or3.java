import java.util.Scanner;

public class Trp_07_DivisibleBy5Or3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number: ");
        int n = sc.nextInt();

        if(n%3 == 0 || n%5 == 0) {
            System.out.print("Number is divisible by 5 or 3");
        }else {
            System.out.print("Number is Not divisible by 5 or 3");
        }
    }
}
