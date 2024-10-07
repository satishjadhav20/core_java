package Switch;

import java.util.Comparator;
import java.util.Scanner;

public class Assign3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1 = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter number 2");
        int num2 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter number 3");
        int num3 = sc2.nextInt();

        switch (compare(num1, num2, num3)) {
            case 1:
                System.out.println(num1 + " " + num2 + " " + num3);
                break;
            case 2:
                System.out.println(num1 + " " + num3 + " " + num2);
                break;
            case 3:
                System.out.println(num2 + " " + num1 + " " + num3);
                break;
            case 4:
                System.out.println(num2 + " " + num3 + " " + num1);
                break;
            case 5:
                System.out.println(num3 + " " + num1 + " " + num2);
                break;
            case 6:
                System.out.println(num3 + " " + num2 + " " + num1);
                break;
            default:
                System.out.println("Numbers are not distinct.");
                break;
        }
    }

    public static int compare(int num1, int num2, int num3) {
        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                return 1; // num1, num2, num3
            } else {
                return 2; // num1, num3, num2
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                return 3; // num2, num1, num3
            } else {
                return 4; // num2, num3, num1
            }
        } else {
            if (num1 <= num2) {
                return 5; // num3, num1, num2
            } else {
                return 6; // num3, num2, num1
            }
        }
    }
}
