import java.util.*;
public class sumofitsdigits {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int dig,sum=0;
        while(num!=0)
        {
            dig=num%10;
            sum+=dig;
            num/=10;
        }
        System.out.println(sum);
    }
}
