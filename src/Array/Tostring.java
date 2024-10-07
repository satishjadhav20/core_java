package Array;

import java.util.Arrays;

public class Tostring {
    public static void main(String[] args) {
        String[] array={"satish","akanksha","digu","daya","ashish"};

        System.out.println("toString method"+Arrays.toString(array));

        System.out.println("asList method"+Arrays.asList(array));

        int [] [] a={{10,20},{30,40}};

        System.out.println("deepToString method"+Arrays.deepToString(a));

    }
}
