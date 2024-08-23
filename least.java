import java.util.*;
class least{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        //int dig=sc.nextInt();
        int a=num-1;
        int b=10;
        for (int i=1;i<num;i++)
        {
            b=b*10;
        }
        b=b+a;
        System.out.println(b);
    }
}