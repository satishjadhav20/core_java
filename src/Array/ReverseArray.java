package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int [] array = {10,20,30,40,50};
        int [] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }

        System.out.print("Reversed array: ");
        for(int num : reversedArray){
            System.out.print(num + " ");
        }
    }
}
