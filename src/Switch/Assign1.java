package Switch;

import java.util.Scanner;

public class Assign1 {
    public static void main(String[]args){
        int year;
        String month = " ";
        System.out.println("enter month number");
        Scanner sc = new Scanner(System.in);
        year =sc.nextInt();

         switch (year){
             case 1:
                 month ="january";
                 break;
             case 2:
                 month ="february";
                 break;
             case 3:
                 month ="march";
                 break;
             case 4:
                 month ="april";
                 break;
             case 5:
                 month ="may";
                 break;
             case 6:
                 month ="june";
                 break;
             case 7:
                 month ="jully";
                 break;
             case 8:
                 month ="aug";
                 break;
             case 9:
                 month ="september";
                 break;
             case 10:
                 month ="oct";
                 break;
             case 11:
                 month ="november";
                 break;
             case 12:
                 month ="december";
                 break;
             default:
                 System.out.println("invalid input");
                 sc.close();
                 break;
         }
        System.out.println(month);
        sc.close();
    }
}
