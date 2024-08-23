import java.util.*;
import java.util.Arrays;
class Duplicate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        int i,count=0;
        for(i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(i=0;i<num-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                int c=arr[i];
                System.out.printf("Duplicate elements:- %d ",c);
                count++;
                
            }
        }
        System.out.println();
        System.out.print("Total duplicate count:- "+count);
    }
}
