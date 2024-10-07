package InputByUser;

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Scanner sc1 = new Scanner(System.in);
        String st = sc1.nextLine();

        System.out.println(s+st);
    }
}
