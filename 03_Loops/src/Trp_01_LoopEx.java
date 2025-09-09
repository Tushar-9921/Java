import java.util.Scanner;

public class Trp_01_LoopEx {
//    DRY = Don't repeat yourself
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.print("Enter Your Number: ");
         int n = input.nextInt();
            int i; // Scope of Variable
            for(i = 1; i <= n; i=i+2) {
                System.out.println("Hello Tushar Parmar");
        }
        System.out.println(i);
    }
}
