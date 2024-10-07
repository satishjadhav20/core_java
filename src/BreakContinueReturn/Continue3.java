package BreakContinueReturn;

public class Continue3 {
    public static void main(String[] args) {
        int n =1;
        do{
            n = n+2;
            if(n==49){
                System.out.println(" ");
                continue;
            }
            System.out.println(n);
        }while(n<100);

    }
}
