package Operators;

public class Assign13 {
    public static void main(String[] args) {
        int number = 1234;
        int thousands = number / 1000;
        int hundreds = (number / 100) % 10;
        int tens = (number / 10) % 10;
        int units = number % 10;

        thousands += 2;
        hundreds += 2;
        tens += 2;
        units += 2;

        int newNumber = thousands * 1000 + hundreds * 100 + tens * 10 + units;


        System.out.println("Original number: " + number);
        System.out.println("Number with digits incremented by 2: " + newNumber);


    }
}
