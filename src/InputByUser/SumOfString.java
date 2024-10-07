package InputByUser;

import java.util.Scanner;

public class SumOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string 1 : ");
        String s = sc.next();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the String 2 :");
        String t = sc1.next();

        System.out.println("addition of two String is :");
        System.out.println(s +" "+t);
    }
}
