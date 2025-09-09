import java.util.Scanner;

public class Trp_03_AbsoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Absolute Value Calculator: ");
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();

//        if(num > 0) {
//            System.out.println(num);
//        } else {
//            System.out.println(-num);
//        }

        // 2. Pattern
        if(num < 0) {
            num = -num;
        }
        System.out.println(num);
    }
}
