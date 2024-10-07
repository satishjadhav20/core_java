package BreakContinueReturn;

public class Continue {
    public static void main(String[] args) {
        for(int i=5; i <= 50;i++){
            if(i==15){
                System.out.println(" ");
                continue;
            }
            System.out.println(i);
        }
    }
}
