package Switch;

import java.util.Scanner;

public class Assign5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the person one age");
        int age1 = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the person two age");
        int age2 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the person three age");
        int age3 = sc2.nextInt();

        int oldest, youngest;
        oldest = age1;
        youngest = age1;

        switch (compareAges(age2, oldest, youngest)) {
            case 1:
                oldest = age2;
                break;
            case -1:
                youngest = age2;
                break;
            default:
                break;
        }

        // Compare age3 with current oldest and youngest
        switch (compareAges(age3, oldest, youngest)) {
            case 1:
                oldest = age3;
                break;
            case -1:
                youngest = age3;
                break;
            default:
                break;
        }

        // Output the results
        System.out.println("Oldest person's age: " + oldest);
        System.out.println("Youngest person's age: " + youngest);

    }
    private static int compareAges(int age, int currentOldest, int currentYoungest) {
        if (age > currentOldest) {
            return 1;
        }
        else if (age < currentYoungest) {
            return -1;
        }
        else {
            return 0;
        }
    }
}

