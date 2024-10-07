package LamdaExpresion;

public class Calculator {
    public static void main(String[] args) {
        interface A {
             void result(int a , int b);
        }
        class B implements A{
            @Override
            public void result(int a, int b) {
                System.out.println(a + b);
            }
        }
        A a1= new B();
        a1.result(5,10);

        A a2 = new A(){
            @Override
            public void result(int a, int b) {
                System.out.println(a - b);
            }
        };
        a2.result(20,10);

        //lambda expression
        A a3=(a,b)-> System.out.println(a*b);
        a3.result(10,10);

        class Cal{
             int PrintDiv(int a, int b){
                return a / b;
            }
        }
        //method reference
       Cal c = new Cal();
        A a5 = c :: PrintDiv;
        a5.result(500,100);
        System.out.println(c);

        }
    }

