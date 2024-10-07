package BreakContinueReturn;

public class Return4 {
    public static int calculateValue(int a, int b){
        if(a<0||b<0){
            return -1;
        }
        return a*b;
    }
    public static void main(String[] args) {
        int result1 = calculateValue(5,3);
        System.out.println("Product is: " + result1);

        int result2 = calculateValue(-2, 4);
        System.out.println("Product is: " + result2);
    }
}
