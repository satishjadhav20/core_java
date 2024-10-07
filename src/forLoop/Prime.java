package forLoop;

public class Prime {
    public static void main(String [] args){
        int num=29;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                if(i%j==0){
                    System.out.println(j+" ");
                }
            }
            System.out.println();
        }
    }
}
