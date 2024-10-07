package BreakContinueReturn;

public class Break4 {
    public static void main(String[] args) {
     outerloop :for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 3; j++) {
                if(i == 2 && j == 2) {
                    break outerloop;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
