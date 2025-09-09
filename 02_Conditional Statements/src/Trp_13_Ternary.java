import java.util.Scanner;

public class Trp_13_Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your First Number: ");
        int n = input.nextInt();

//        if(n%2 == 0) System.out.println("Even");
//        else System.out.println("Odd");
        // ulta vacho if else ne = ternary operator


        // condition ? true : false


        System.out.print(n+ " is " + ((n%2 == 0) ? "Even" : "Odd"));
    }
}
