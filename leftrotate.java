import java.util.*;
class leftrotate
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("How many times ");
        int rot=sc.nextInt();
        int arr[]=new int[num];
        int i,j;
        for(i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(j=0;j<rot;j++)
        {
            int first=arr[0];
            for(i=0;i<num-1;i++)
            {
                arr[i]=arr[i+1];
            }
            arr[num-1]=first;
        }
        for(int e:arr)//all input will print --> for each loop
        System.out.print(e+" ");
    }
}
