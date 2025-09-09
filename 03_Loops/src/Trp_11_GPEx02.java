import java.util.Scanner;

// Print This GP 3,12,48... Up to n term
public class Trp_11_GPEx02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Printing the Geometric Progression Up to n term: ");

        System.out.print("Enter Your Number: ");
        int n = input.nextInt();

        int a = 3;
        for(int i=1; i<=n; i++) {
            System.out.print(a + " ");
            a = a * 4;
        }
    }
}
