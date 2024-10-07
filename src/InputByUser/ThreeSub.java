package InputByUser;

import java.util.Scanner;

public class ThreeSub {
    public static void main(String[] args) {
        float per=0;
        float total=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first subjects of marks");
        int java = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter second subjects of marks");
        int python = sc1.nextInt();


        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter third subjects of marks");
        int kotlin = sc2.nextInt();

        total= java + python + kotlin;
        per = total / 3;
        System.out.println("percentage is "+per);

    }
}
