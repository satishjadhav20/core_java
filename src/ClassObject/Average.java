package ClassObject;

import java.util.Scanner;

public class Average {
    void CalculateAndPrintAvg(double num1,double num2,double num3){
        double avg = (num1 + num2+ num3)/3;
        System.out.printf("The average of %.2f, %.2f, and %.2f is %.2f%n",num1,num1,num3,avg);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Average avgCal = new Average();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        avgCal.CalculateAndPrintAvg(num1,num2,num3);
    }
}
