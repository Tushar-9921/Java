import java.util.Scanner;

public class Trp_02_DivisibleByFiveOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();

        if(num%5 == 0) {
            System.out.println("Number is Divisible by 5");
        } else {
            System.out.println("Number is Not Divisible by 5");
        }


    }
}
