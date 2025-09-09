import java.util.Scanner;

public class Trp_08_SideOfTriangleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Check Triangle or Not calculator: ");
        System.out.print("Enter Your Fist Side OF Triangle: ");
        int first = sc.nextInt();
        System.out.print("Enter Your Second Side OF Triangle: ");
        int second = sc.nextInt();
        System.out.print("Enter Your Third Side OF Triangle: ");
        int third = sc.nextInt();

        if(first+second > third && second+third > first && third+first > second) {
            System.out.print("Valid Triangle");
        }else {
            System.out.print("Invalid Triangle");
        }
    }
}
