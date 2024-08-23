import java.util.*;
class Automorphic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sq=num*num;
        int t=1;
        while(num>0)
        {
            if(num%10 != sq%10)
            {
                t=0;
                System.out.println("Not Automorphic");
                break;
            }
            num/=10;
            sq/=10;
        }
        if(t==1)
        {
            System.out.println("Automorphic");
        }
    }
}