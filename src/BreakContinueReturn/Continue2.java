package BreakContinueReturn;

public class Continue2 {
    public static void main(String[] args) {
        int n =2;
        while(n<=100){
            n=n+2;
            if(n==50){
                System.out.println(" ");
                continue;
            }

            System.out.println(n);
        }
    }
}
