import java.util.*;
class dig{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String dig=String.valueOf(num);

        int i;
        for(i=0;i<dig.length();i++){
            char a = dig.charAt(i);
            int x = a - '0';
            if(x%2==0)
            System.out.println(x+" even");
            else
            System.out.println(x+" odd");
        }

    }
}
