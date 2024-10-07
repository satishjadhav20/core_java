package Switch;

import java.util.Scanner;

public class Assign2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number ");
        int num =sc.nextInt();

        switch (num){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Positive");
                break;
            case -1:
            case -2:
            case -3:
            case -4:
            case -5:
            case -6:
            case -7:
            case -8:
            case -9:
                System.out.println("Negative");
                break;
            default:
                System.out.println("invalid input");
                break;
        }
    }
}
