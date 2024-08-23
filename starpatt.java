import java.util.*;
public class starpatt {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i,j;
        for(i=1;i<=num;System.out.println(),i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
        }
    }
}
