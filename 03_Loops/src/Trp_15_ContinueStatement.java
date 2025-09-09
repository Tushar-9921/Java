// WAP to print odd numbers from 1 to 100 using CONTINUE Statement
public class Trp_15_ContinueStatement {
    public static void main(String[] args) {

        for(int i=1; i<=100; i++) {
            if(i%2 == 0) { // even
                continue; // Jump the condition/skip this iteration
            }
            System.out.print(i + " ");
        }
    }
}
