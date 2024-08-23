import java.util.*;
public class PowerofaNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int power=sc.nextInt();
        double powerNumber=Math.pow(base,power);
        System.out.printf("%.0f",powerNumber);
    }
}
