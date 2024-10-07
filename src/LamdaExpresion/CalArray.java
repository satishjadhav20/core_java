package LamdaExpresion;


interface S1{
    int calculateArray(int [] array);
        }
public class CalArray {
    public static void main(String[] args) {
        S1 avgArray = array -> {
            int sum = 0;
            for (int i=0; i< array.length;i++) {
                sum = sum + i;
            }

            return (int) ((double) sum / array.length);
        };
        int[] array = {1, 2, 3, 4, 5};

        double result = avgArray.calculateArray(array);
        System.out.println("Average of the array elements: " + result);

    }
}
