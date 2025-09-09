import java.util.Scanner;

public class Trp_09_CheckMultipleCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to My Own Multiple Condition checker: ");

        System.out.print("Enter Your Number: ");
        int n = input.nextInt();

        if(n%3 == 0 && n%5 == 0){
            System.out.print("Isha");
        } else if(n%3 == 0) {
            System.out.print("Banu");
        }else if(n%5 == 0) {
            System.out.print("Riya");
        }else {
            System.out.print("Isha");
        }
    }
}
