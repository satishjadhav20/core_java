package Array;
// find maximum number of an array
public class maxNumArray {
    public static void main(String[] args) {
        int [] array= {1,22,32,12,11,67};
        int max = array[0];

        for (int  i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("maximum number of an array is "+max);
    }
}
