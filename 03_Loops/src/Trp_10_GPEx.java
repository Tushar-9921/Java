import java.util.Scanner;

// Print This GP 1,2,4,8,16,32... Up to n term
// GP => aₙ = a ⋅ rⁿ⁻¹ (r = common ratio)
public class Trp_10_GPEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Printing the Geometric Progression Up to n term: ");

        System.out.print("Enter Your Number: ");
        int n = input.nextInt();

        int a=1;
        for(int i = 1; i <= n; i++){
            System.out.print(a + " ");
            a = a*2;
        }
    }

}
