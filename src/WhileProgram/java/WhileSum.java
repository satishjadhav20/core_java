package WhileProgram.java;

public class WhileSum {
    public static void main(String [] args){
        int sum=0;
        int i=1;
        while(i<=100){
            sum+=i;
            System.out.println("sum is :"+sum);
            i++;
        }
    }
}
