import java.util.*;
class friendlypair 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num1=sc.nextInt();
        int i,j,sum=0,sum1=0;
        for(i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        for(j=1;j<num1;j++)
        {
            if(num1%j==0)
            {
                sum1=sum1+j;
            }
        }
        if(sum/num==sum1/num1)
        {
            System.out.println("Friendly Pair");
        }
        else{
          System.out.println("Not a Friendly Pair");
        }
    }
    
}
