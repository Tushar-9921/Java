import java.util.Scanner;

// // Print This AP 4,7,10,13,16... Up to n term
public class Trp_08_APEx02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Printing the Arithmetic Progression Up to n term: ");

        System.out.print("Enter Your Number: ");
        int n = input.nextInt();

        for (int i = 4; i <= 1+3*n; i = i + 3) {
            System.out.print(i + " ");
        }
    }

}