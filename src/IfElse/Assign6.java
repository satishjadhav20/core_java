package IfElse;
import java.util.Scanner;
public class Assign6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of class held ");
        int classHeld  =sc.nextInt();

        System.out.println("enter the number of classes attend ");
        int classAttend  =sc.nextInt();

        double attendancePer = (double)classAttend / classHeld * 100;
        System.out.println("attendance is :"+attendancePer);

        if(attendancePer >= 75){
            System.out.println("student is allowed to exam seat");
        }
        else{
            System.out.println("student is not allowed to exam seat");
        }
    }
}
