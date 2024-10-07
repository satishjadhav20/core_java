package BreakContinueReturn;

public class Continue4 {
    public static void main(String[] args) {
        int num = 456;
        do{
            num = num /10;
            if(num == 45) {
                System.out.println(" ");
                continue;
            }
            System.out.println(num);
        }while(num > 0);
    }
}
