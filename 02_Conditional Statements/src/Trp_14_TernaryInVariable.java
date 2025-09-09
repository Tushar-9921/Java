import java.util.Scanner;

public class Trp_14_TernaryInVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        int tushar = (n > 0) ? 100 : 0; // ternary Store In Value

        int i = (a>b) ? ((a>c) ? a : c) :  ((b>c) ? b : c);
        System.out.println(i);
    }
}
