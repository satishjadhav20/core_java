package dowhile;

public class LeftRightDo {
    public static void main(String[] args) {
        int left = 0;
        int right = 10;
        do{
            System.out.println(left+" "+right);
            left++;
            right--;
        }while(left < right);
    }
}
