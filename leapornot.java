import java.util.*;
public class leapornot
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(((num/4)*4==num &&   (num/400)*400==num) || (num/100)*100!=num)
        {
            System.out.println("Leap year");
        }
        else
        System.out.println("Not a leap year");
    }
    
}
