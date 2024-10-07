package IfElse;

import java.util.Scanner;

public class Assign7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("do you had medical cause");
        String medicalCause = sc.nextLine();

        System.out.println("enter the number of class held ");
        int classHeld  =sc.nextInt();

        System.out.println("enter the number of classes attend ");
        int classAttend  =sc.nextInt();

        double attendancePer = (double)classAttend / classHeld + 100;
        System.out.println("attendance is :"+attendancePer);

        if(medicalCause == "yes"){
            System.out.println("can sit for exam");
        }
        else if(attendancePer >= 75){
            System.out.println("student is allowed to exam seat");
        }

        else{
            System.out.println("student is not allowed to exam seat");
        }
    }
}

