import java.util.Scanner;

//import javax.sound.midi.Soundbank;

public class addoneelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num+1];
        int i;
        for(i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        int pos=sc.nextInt();          
        for(i=0;i<num+1;i++)
        {
            if(i==pos-1)
            System.out.print(key+" ");
            else if(i<pos)
            System.out.print(arr[i]+" ");
            else
            System.out.print(arr[i-1]+" ");
        }
    }
}
