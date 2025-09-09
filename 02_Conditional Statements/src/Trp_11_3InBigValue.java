import java.net.Socket;
import java.util.Scanner;

public class Trp_11_3InBigValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your First Number: ");
        int first = input.nextInt();
        System.out.print("Enter Your Second Number: ");
        int second = input.nextInt();
        System.out.print("Enter Your Third Number: ");
        int third = input.nextInt();

        if(first > second && first > third) {
            System.out.print(first + " is big");
        } else if(second > first && second > third) {
            System.out.print(second + " is big");
        } else {
            System.out.print(third + " is big");
        }

    }
}
