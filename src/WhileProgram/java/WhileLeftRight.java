package WhileProgram.java;

public class WhileLeftRight {
    public static void main(String[] args) {
        int left = 0;
        int right = 10;
        while (left < right) {
            System.out.println(left+" "+right);
            left++;
            right--;
        }
    }
}
