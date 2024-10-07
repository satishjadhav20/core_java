package WhileProgram.java;
import java.util.Scanner;
public class WhilePerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= num / 2) {
            if (num % i == 0) {
                sum = sum + i;
                System.out.println("The sum is: " + sum);
            }
            i++;
        }
        System.out.println(num);
            if (sum == num) {
                System.out.println("The number is the perfect number");
            } else {
                System.out.println("The number is not the perfect number");
            }
        }
    }

