import java.util.*;
public class Comparing2integers {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1==num2)
            System.out.println(num1+" and "+num2+" are equal");
        else if(num1<num2)
            System.out.println(num1+" is less than "+num2);
        else if (num1>num2) 
            System.out.println(num1>num2);
    }
}
