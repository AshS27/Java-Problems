import java.util.*;
import java.util.Arrays;
class triplet
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        int i,count=0;
        for(i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(i=0;i<N-2;i++)
        {
            if(arr[i]+arr[i+1]==arr[i+2])
            {
            count++;
            }
        }
        System.out.println(count);
       
    }
}