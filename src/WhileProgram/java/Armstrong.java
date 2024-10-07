package WhileProgram.java;

public class Armstrong {
    public static void main(String[] args){
        int num=1;
        while (num<=1000){
            int sum=0;
            int temp=num;
            int numberOfDigits = String.valueOf(num).length();
            while (temp !=0){
                int digit=temp % 10;
                sum = sum + digit;
                temp /=10;

            }
        }
    }
}
