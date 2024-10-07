package forLoop;

public class ForFActorial {
    public static void main(String[] args) {
        int n = 11;
        int factorial =1;
        for (int i = 1; i <= n%2; i++) {
            factorial *= i;
            System.out.println("factorial is "+factorial);

     }
       if(factorial == n){
            System.out.println("there number will be factorial  ");
        }
        else{
            System.out.println("there number will be not factorial ");
        }
    }
}
