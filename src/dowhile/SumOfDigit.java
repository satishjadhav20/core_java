package dowhile;

public class SumOfDigit {
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;
        int temp;
        do{
            temp = num % 10;
            sum = sum + temp;
            num = num / 10;
        }while(num > 0);
        System.out.println(sum);
        System.out.println("rest of forLoop.Loop...!");
    }
}
