import java.util.Scanner;
public class jaggedarray {
    public static void main(String[] args) {
        // int r=3;
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int a[][]=new int[r][];
        // a[0]=new int[4];
        // a[1]=new int[2];
        // a[2]=new int[3];
        int c=0;
        for (int i = 0; i < r; i++) {
            c=in.nextInt();//4
            a[i]=new int[c];//4
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=in.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
