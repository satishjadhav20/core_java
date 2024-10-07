package Array;

import java.util.Arrays;

// 1. ==
// 2. .equals()
public class Compare {
    public static void main(String[] args) {
        int a [] ={1,2,3,4,5};
        int b [] ={1,2,3,4,5};
        if(a == b){
            System.out.println("both are equals");
        }
        else{
            System.out.println("both are not equal ");
        }
        if(Arrays.equals(a,b)){
            System.out.println("both are equals");
        }
        else{
            System.out.println("both are not equal ");
        }
    }
}
