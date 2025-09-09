import java.util.Scanner;

public class Trp_09_APWithoutMaths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Printing the Arithmetic Progression Up to n term: ");

        System.out.print("Enter Your Number: ");
        int n = input.nextInt();

        // 4,7,10,13,16,19.... up to n Number of term
        // We are going to use Extra variable
        int a = 4;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a = a + 3;
        }
    }
}
