package Switch;
import java.util.Scanner;
public class Assign9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows for the pattern:");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            StringBuilder pattern = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                switch (j % 2) {
                    case 1:
                        pattern.append("1");
                        break;
                    case 0:
                        pattern.append("0");
                        break;
                }
            }
            System.out.println(pattern.toString());
        }

        scanner.close();
    }
}

