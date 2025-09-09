import java.util.Scanner;
// Using Break Statement
public class Trp_14_PrimeOrComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Prime Number or Composite Number calculator: ");

        System.out.print("Enter your Number: ");
        int n = sc.nextInt();
        int a = 0;
        for(int i=2; i<=n-1; i++) { // i<n
            if(n%i == 0) {
                a = 1; // Composite
                break; // Break the condition
            }
        }
        if(n==1) System.out.print("1 is nither prime nor composite");
        else if(a == 0) {
            System.out.print("Prime Number");
        }else {
            System.out.print("Composite Number");
        }
    }
}
