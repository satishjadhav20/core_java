package Array;

public class SecondLowestNumArray {
    public static void main(String[] args) {
        int [] array = {90,88,12,98,34,65};

        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;

        for (int num : array){
            if (num < lowest) {
                secondLowest = lowest;
                lowest = num;
            }
            else if (num < secondLowest && num > lowest) {
                secondLowest = num;
            }
        }
        if (secondLowest == Integer.MAX_VALUE) {
            System.out.println("No second highest number found.");
        }
        else {
            System.out.println("The second highest number is: " + secondLowest);
        }
    }
}
