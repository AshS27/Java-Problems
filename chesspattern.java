import java.util.*;
public class chesspattern {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i,j;
        int sum=0;
        for(i=0;i<num;System.out.println(),i++)
        {
            for(j=1;j<=num;j++)
            {
               sum=i+j;
               if(sum%2==1)
               System.out.print("1");
               else
               System.out.print("0"); 
            }
        }
    }
}
