import java.util.*;
public class ProductandDivision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int product=a*b;
        int quatient=a%b;
        int remainder=a/b;
        System.out.println(product);
        System.out.printf("%d\n",quatient);
        System.out.println(remainder);
    }
}
