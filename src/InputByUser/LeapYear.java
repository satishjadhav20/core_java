package InputByUser;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year :");
        int year = sc.nextInt();
        boolean isLeap=false;
        if (year % 4 == 0) {
            if(year % 100 ==0 || year % 400 == 0){
                isLeap = true;
            }
        }
        if(isLeap){
            System.out.println("year is leap year"+year);
        }
        else{
            System.out.println("year is not leap year"+year);
        }
    }
}
