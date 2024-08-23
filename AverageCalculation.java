import java.util.*;
public class AverageCalculation {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int mark1=sc.nextInt();
        int mark2=sc.nextInt();
        int mark3=sc.nextInt();
        int mark4=sc.nextInt();
        int mark5=sc.nextInt();
        int total=mark1+mark2+mark3+mark4+mark5;
        float average=total/5;
        System.out.printf("%.2f",average);
    }
}
