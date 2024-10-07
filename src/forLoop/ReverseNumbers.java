package forLoop;

public class ReverseNumbers {
    public static void main(String[] args) {
        int Count=1;
        //row
        for(int i=5 ; i>=1;i--){

            //col
            for(int j=1;j<=i;j++){
                System.out.print(Count+"  ");
            }
            System.out.println();
            Count++;
        }
    }
}
