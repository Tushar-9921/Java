import java.util.Scanner;

// Print This AP 1,3,5,7,9... Up to n term
// AP = a + (n-1) * d (d = common difference)
public class Trp_07_APEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Printing the Arithmetic Progression Up to n term: ");

        System.out.print("Enter Your Number: ");
        int n = input.nextInt();

        for(int i = 1; i <= 2*n-1; i = i+2) {
            System.out.print(i + " ");
        }
    }
}
