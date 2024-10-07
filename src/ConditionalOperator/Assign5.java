package ConditionalOperator;

import java.util.Scanner;

public class Assign5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch = sc.next().charAt(0);

        if(ch >= 'A' &&  ch <= 'Z'){
            System.out.println("it is alphabet"+ch);
        }
        else{
            System.out.println("it is not alphabet");
        }
    }
}
