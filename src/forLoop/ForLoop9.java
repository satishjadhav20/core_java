package forLoop;

public class ForLoop9 {
        public static void main(String[]args){
            int n=5;
            int sum = 0;
            for(int i=1;i<=n;i++) {
                for(int j=1;j<=i;j++){
                    if(sum%2==0){
                        System.out.print(" 1 ");
                    }
                        System.out.print(" 0 ");
                }
                System.out.println();
            }
        }
    }

