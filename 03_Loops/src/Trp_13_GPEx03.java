import java.util.Scanner;

// Display GP - 100,50,25,12.5 ... up to n term
public class Trp_13_GPEx03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wap to display gp 100,50,25... up to n term");

        System.out.print("Enter Your Number: ");
        int n = input.nextInt();

        float a = 100;
        for(int i=1; i<=n; i++) {
            System.out.print(a + " ");
            a = a/2;
        }
    }
}
