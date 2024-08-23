import java.util.Scanner;

public class unique{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        int i,j;
        for(i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        int flag=0;
        int hasvalue=0;
        for(i=0;i<arr.length;i++)
        {
            int element=arr[i];//it store first index and iteration increases its takes accouding to their iteration value// 1 2 3 4 5
            flag=0;
            for(j=0;j<arr.length;j++)
            {
                if(i!=j && arr[j]==element)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.print(arr[i]+" ");
                hasvalue=1;
            }
        }
        if(hasvalue==0)
        {
            System.out.println("No unique element");
        }
    } 
}
