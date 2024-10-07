package BreakContinueReturn;

public class break1 {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            System.out.println(i);
            System.out.println("king java");
            if(i == 2){
                System.out.println(i);
                break;
            }
        }
    }
}
