import java.util.*;
public class AreaCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int side=sc.nextInt();
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        float radius=sc.nextFloat();
        int areaofSquare=side*side;
        int areaofRectangle=length*breadth;
        double areaofCircle=3.14*radius*radius;
        System.out.println(areaofSquare);
        System.out.println(areaofRectangle);
        System.out.printf("%.2f",areaofCircle);

    }
}
