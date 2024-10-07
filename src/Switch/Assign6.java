package Switch;
import java.util.Scanner;
public class Assign6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks[] = new int[5];
        int total = 0;
        double average = 0.0;

        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total += marks[i];
        }

        average = total / 5.0;


        int choice;
        do {
            System.out.println("\nSelect an operation:");
            System.out.println("1. View total marks");
            System.out.println("2. View average marks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Total marks: " + total);
                    break;
                case 2:
                    System.out.println("Average marks: " + average);
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 3);

        scanner.close();
    }
}


