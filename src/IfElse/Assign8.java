package IfElse;

public class Assign8 {
    public static void main(String[] args) {
        int x = 2;
        int y= 5;
        int z = 0;
        if(x == 2){
            System.out.println("condition is true ");
        }
        else if(x != 5){
            System.out.println("condition is true");
        }
        else if (x != 5 && y >= 5){
            System.out.println("condition is true ");
        }
        else if (z != 0 || x == 2){
            System.out.println("condition is true ");
        }
        else if (y < 30){
            System.out.println("condition is false");
        }
        else{
            System.out.println("default condition ");
        }
    }
}
