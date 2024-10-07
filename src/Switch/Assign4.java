package Switch;

import java.util.Scanner;
public class Assign4 {
    public static void main(String[]args){
        int a,b,ch;
        System.out.println("Enter value of a: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();

        System.out.println("Enter value of b: ");
        Scanner sc1=new Scanner(System.in);
        b=sc1.nextInt();

        System.out.println("enter user choice ch: ");
        Scanner sc2=new Scanner(System.in);
        ch=sc2.nextInt();

        switch (ch)
        {
            case 1:
            System.out.println("sum"+(a+b));
            break;

            case 2:
            System.out.println("sub"+(a-b));
            break;

            case 3:
            System.out.println("mul"+(a*b));
            break;

            case 4:
            System.out.println("div"+(a/b));
            break;

            default:
                System.out.println("invalid choise");

        }
    }
}

