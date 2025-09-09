import java.util.Scanner;

public class Trp_05_SpCp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Profit Or Loss Calculator: ");

        System.out.print("Enter Your Cost Price: ");
        int cp = sc.nextInt();

        System.out.print("Enter Your Selling Price: ");
        int sp = sc.nextInt();

        if(sp > cp) {
            int profit = sp - cp;
            int profitPercent = (sp-cp) * 100 / cp;
            System.out.print("You made a Profit of " + profit + " rupees (" + profitPercent + "%)");
        } else if(cp > sp){
            int loss = cp - sp;
            int lossPercent = (cp-sp) * 100 / cp;
            System.out.print("You incurred a loss of " + loss + " rupees (" + lossPercent + "%)");
        }else {
            System.out.print("Yor are Getting No Profit or No Lost");
        }
        sc.close();
    }
}
