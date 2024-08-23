import java.util.*;
public class space {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print(Character.toLowerCase(str.charAt(0)));
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
                System.out.print(" ");
            }
            System.out.print(Character.toLowerCase(str.charAt(i)));
        }
    }
}
