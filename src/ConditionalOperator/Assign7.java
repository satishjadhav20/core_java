package ConditionalOperator;

import java.util.Scanner;

public class Assign7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();

        if(isPerfectSqrt(num)){
            System.out.println("perfect sqrt");
        }
        else{
            System.out.println("not perfect");
        }
    }
    public static boolean isPerfectSqrt(int num){
        if(num < 0){
            return false;
        }
        double sqrt = Math.sqrt(num);
        return ((sqrt - Math.floor(sqrt)) == 0);
    }
}
