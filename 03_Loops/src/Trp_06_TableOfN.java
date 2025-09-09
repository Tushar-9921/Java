import java.util.Scanner;

public class Trp_06_TableOfN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Table Calculator: \n");

        System.out.print("Enter Your Number of Table: ");
        int n = input.nextInt();

        for(int i=1; i<=10; i++) {
            int table = i * n;
            System.out.print(table + " ");
        }
    }
}
