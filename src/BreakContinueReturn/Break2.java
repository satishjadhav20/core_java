package BreakContinueReturn;

public class Break2 {
    public static void main(String[] args) {
        int i = 2;
        while(i<100){
            System.out.println(i);
            if(i == 50){
                System.out.println(i);
                break;
            }
            i=i+2;
        }
    }
}
