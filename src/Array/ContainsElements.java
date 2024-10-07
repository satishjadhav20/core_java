package Array;

public class ContainsElements {
    public static void main(String[] args) {
        int [] array = {1,3,5,7,9};
        int target = 9;
        boolean founds = false;

        for (int num : array){
            if(num == target){
                founds = true;
                break;
            }
        }
        if (founds){
            System.out.println("contains array elements"+target);
        }
        else {
            System.out.println("contains do nt array elements ");
        }
    }
}
