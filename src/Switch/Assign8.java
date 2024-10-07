package Switch;
import java.util.Scanner;
public class Assign8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows for the pattern:");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            switch (i) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("22");
                    break;
                case 3:
                    System.out.println("333");
                    break;
                case 4:
                    System.out.println("4444");
                    break;
                case 5:
                    System.out.println("55555");
                    break;
                default:
                    System.out.println("Pattern for row " + i + " is not defined.");
            }
        }

        scanner.close();
    }
}


