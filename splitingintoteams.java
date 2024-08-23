import java.util.*;
class splitingintoteams
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int numberofStudent=sc.nextInt();
        int numberofTeam=sc.nextInt();
        int studentinteam=numberofStudent/numberofTeam;
        //int remaining=numberofStudent-(numberofTeam*studentinteam);--> roshan sir method
        int remaining=numberofStudent%numberofTeam;
        System.out.println("The number of students in each team is "+studentinteam+" and left out is "+remaining);
    }
} 
