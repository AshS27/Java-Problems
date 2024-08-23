import java.util.*;
public class slidemove {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        int i;
        for(i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        ArrayList<Integer> l1=new ArrayList<>();
        for(i=0;i<k;i++)
        {
            l1.add(arr[i]);
        }
        ArrayList<Integer> l2=new ArrayList<>();
        for(i=k;i<num;i++)
        {
            l2.add(arr[i]);
        }
        Integer arr1[]=new Integer[l1.size()];
        Integer arr2[]=new Integer[l2.size()];
        arr1=l1.toArray(arr1);
        arr2=l2.toArray(arr2);
        for(int e:arr2)
        {
            System.out.print(e+" ");
        }
        for(int e:arr1)
        {
            System.out.print(e+" ");
        }
    }
}
