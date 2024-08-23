import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int principal=sc.nextInt();
        int years=sc.nextInt();
        float interest=sc.nextFloat();
        double SimpleInterest=principal*years*interest/100;
        System.out.printf("%.2f",SimpleInterest);
    }
    
}
