import java.util.Scanner;

public class Trp_11_SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Simple Interest Calculator: \n");

        System.out.print("Enter Your Price: ");
        float price = sc.nextFloat();

        System.out.print("Enter Time Price: ");
        float time = sc.nextFloat();

        System.out.print("Enter Rate Price: ");
        float rate = sc.nextFloat();

        double si = price * time * rate / 100;

        System.out.print("Your Simple Interest Is: " + si);

        sc.close();
    }
}
