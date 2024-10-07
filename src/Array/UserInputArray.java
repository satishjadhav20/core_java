package Array;

import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size = sc.nextInt();

        int[] numbers = new int[size];//default value of integer is 0.
        //input
        for(int i=0; i< size;i++){
            numbers[i]=sc.nextInt();
        }

        int x = sc.nextInt();
        //output
        for(int i=0; i<size;i++){
            System.out.println(numbers[i]); //stores default value of the console
        }
    }
}
