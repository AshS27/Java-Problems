import java.util.*;
public class usingTernaryOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String result=(number%2==0)?"Even":"Odd";//Using ternary Operator
        System.out.println(result);
        //if(number%2==0)
        //System.out.println("Even");
        //else
        //System.out.println("Odd");
         
    }
}
