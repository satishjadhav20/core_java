package forLoop;

public class Pattern123 {
    public static void main(String[] args) {
        int numLine = 4;
        for (int i = 0; i < numLine; i++) {
            char ch =(char)('A' + i);

            for (int j = 0; j <= i; j++) {
                System.out.print(ch+" ");
            }
            System.out.println( );
        }
    }
}
