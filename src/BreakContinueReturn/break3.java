package BreakContinueReturn;

public class break3 {
    public static void main(String[] args) {
        int i= 1;
        do{
            System.out.println(i);
            if(i == 49){
                System.out.println(i);
                break;
            }
            i = i+ 2;
        }while(i<100);
    }
}
