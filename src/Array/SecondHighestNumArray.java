package Array;

public class SecondHighestNumArray {
    public static void main(String[] args) {
        int [] array = {90,88,12,98,34,65};
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : array){
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            }
            else if (num > secondHighest && num < highest) {
                secondHighest = num;
            }
        }
        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("No second highest number found.");
        }
        else {
            System.out.println("The second highest number is: " + secondHighest);
        }
    }
}
