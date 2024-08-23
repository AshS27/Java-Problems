import java.util.*;
public class sumofall {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0,dig;
        {
            dig=a%10;
            sum+=dig;
            a/=10;
        }
        System.out.print(sum);
    }
    
}

