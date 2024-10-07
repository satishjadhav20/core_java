package Inheritence.Multiple;

 interface A {
    void show();
}
 interface B{
    void show();
}
class C implements A,B{
     public void show(){
         System.out.println("interface A and B");
     }
    public static void main(String[] args) {
        C c = new C();
        c.show();
    }
}
