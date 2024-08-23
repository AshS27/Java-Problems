import java.util.*;
public class ProfitCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int newspaper=sc.nextInt();
        int rate=sc.nextInt();
        int agency=sc.nextInt();
        int total=newspaper*rate;
        int price=newspaper*agency+100;
        int profit=total-price;
        System.out.println("The profit obtained is Rs."+profit);
    }
}
