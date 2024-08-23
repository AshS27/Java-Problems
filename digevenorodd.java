import java.util.*;
class digevenorodd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int dig;
        int rev=0;
        while(num!=0)
        {
            dig=num%10;
            rev=rev*10+dig;
            num/=10;
        }
        while(rev!=0)
        {
            int ev1=rev%10;
            if(ev1%2==0){
                System.out.println(ev1+" even");
            }
            else{
                System.out.println(ev1+" odd");
            }
            rev/=10;
        }
        
    }
}  