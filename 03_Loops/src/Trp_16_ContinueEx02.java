// WAP to print Even numbers from 1 to 100 using CONTINUE Statement

public class Trp_16_ContinueEx02 {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++) {
            if(i%2 != 0) {
                continue; // Skip
            }
            System.out.print(i + " ");
        }
    }
}
