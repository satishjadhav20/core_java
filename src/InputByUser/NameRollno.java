package InputByUser;

import java.util.Scanner;

public class NameRollno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter your roll_no");
        int  roll_no = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter your field of interest");
        String fieldOfInterest = sc2.nextLine();

        System.out.println("hey my name is  " +name + "my roll no is " +roll_no + "my field of interest is " +fieldOfInterest);
    }
}
