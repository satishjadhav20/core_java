package Array;

public class MinNumArray {
    public static void main(String[] args) {
        int [] array = {21,45,89,65,43,99,11};
        int min = array[0];
        for (int i=0; i<array.length; i++){
                if(array[i]<min){
                    min = array[i];
                }
        }
        System.out.println("minimum number of an array is "+min);
    }
}
