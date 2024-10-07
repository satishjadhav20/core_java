package ClassObject;

public class Demo {
    public int Add(int a,int b){
        return a+b;
    }
    public static boolean m1(){
        System.out.println("Hello I am From Vadgav");
        return false;
    }
    public static void main(String[] args) {
        System.out.println(Demo. m1());
        Demo d = new Demo();
        int sum =d.Add(10,20);
        System.out.println(sum);
    }
}
