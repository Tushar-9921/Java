import java.util.Scanner;

public class Trp_12_3InBigUsingNestedIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your First Number: ");
        int first = input.nextInt();
        System.out.print("Enter Your Second Number: ");
        int second = input.nextInt();
        System.out.print("Enter Your Third Number: ");
        int third = input.nextInt();

        if(first > second) { // a is never greatest
            if(first > third){
                System.out.print(third + " is big");
            } else {
                System.out.print(third + " is big");
            }
        } else { // second > first
            if(second > third) {
                System.out.print(second + " is big");
            } else {
                System.out.print(third + " is big");
            }
        }
    }
}
