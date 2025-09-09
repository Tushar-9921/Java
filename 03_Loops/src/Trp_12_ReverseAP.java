
// Print This AP 100,97,94... Up to n positive term
public class Trp_12_ReverseAP {
    public static void main(String[] args) {

        int a = 100;
        for(int i=100; a > 0; i=i-3) {
            System.out.print(a + " ");
            a = a-3;
        }
    }
}
