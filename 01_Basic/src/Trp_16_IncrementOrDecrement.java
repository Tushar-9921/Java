public class Trp_16_IncrementOrDecrement {
    public static void main(String[] args) {

        int x = 10; // x = 11
        int y = x++; // y = 10 then increment x = x+1
        System.out.println(x + " " + y);

        // Post increment
        int t = 10;
        System.out.println(t++);
        System.out.println(t);
        // Pre increment
        int r = 10;
        System.out.println(++r);
        System.out.println(r);
        // Post increment
        int p = 10;
        System.out.println(p--);
        System.out.println(p);;
        //Pre increment
        int q = 10;
        System.out.println(--q);
        System.out.println(q);

    }
}