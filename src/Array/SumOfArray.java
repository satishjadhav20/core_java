package Array;

public class SumOfArray {
    public static void main(String[] args) {
        int [] array= {11,12,22,34,56,78};
        int sum = 0;
        for (int i = 0; i<array.length; i++){
            sum = sum + array[i];
        }
        System.out.println("sum of array is "+sum);//213
    }
}
