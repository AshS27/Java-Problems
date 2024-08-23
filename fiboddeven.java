import java.util.*;
public class fiboddeven {
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int n1=1,n2=1,n3,i;
    int odd=2,even=0;
    System.out.print(n1+" "+n2);
    for(i=2;i<num;i++)
    {
        n3=n1+n2;
        System.out.print(" "+n3);
        if(n3%2==0)
        even++;
        else 
        odd++;
        n1=n2;
        n2=n3;
    }
    System.out.println("\nodd="+odd);
    System.out.println("even="+even);
   } 
}
