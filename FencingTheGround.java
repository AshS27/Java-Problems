import java.util.*;
public class FencingTheGround {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        int lengthofRope=(2*length)+(2*breadth);
        int quantityofCarper=length*breadth;
        System.out.println(lengthofRope+"m");
        System.out.println(quantityofCarper+"sqm");
    }
}
