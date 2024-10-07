package Array;

public class AvgArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        int sum = 0;

        for (int num : array){
            sum = sum + num;
        }
        double average = (double) sum / array.length;
        System.out.println("the average of an array is "+average);
    }
}
