package Array;

public class BasicArray {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 10;
        a[1] =20;
        a[2] = 30;
        //traditional for loop way,
        System.out.println("traditional for loop way");
        for (int i=0;i<3;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println("foreach loop way");
        //foreach loop way
        for (int i : a){
            System.out.println(i+" ");
        }

    }
}
