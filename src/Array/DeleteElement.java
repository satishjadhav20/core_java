package Array;
import java.util.Scanner;
public class DeleteElement {
    public static void main(String[] args) {
        int size,loc;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size: ");
        size=sc.nextInt();

        int array[] = new int[size];
        System.out.println("enter array elements: ");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("enter array location (0 to " + (size - 1) + "):: ");
        loc=sc.nextInt();

        for(int i=loc;i<size;i++){
            array[i]=array[i+1];
        }
        size--;
        System.out.println("array after deletion ");
        for(int i=0;i<size-1;i++){
            System.out.print(array[i]+" ");
        }
    }
}
