package LamdaExpresion;

interface Super {
    void m1();
}

class Main{
    public static void main(String[] args) {
         Super s = new Super() {
             @Override
             public void m1() {
                 System.out.println("Super interface method ");
             }
         };
         s.m1();
    }
}
