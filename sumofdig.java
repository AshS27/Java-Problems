import java.util.*;
public class sumofdig {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        if(n>9){
            s=(n%9==0)?9:n%9;//ternary operator
        }
        else{
            s=n;
        }
        System.out.println("The sum of digits of " + n + " is " + s);
        if(n%s==0){
            System.out.println("Harshad number");
        }
        else{
            System.out.println("Not Harshad number");
        }
    }
}
