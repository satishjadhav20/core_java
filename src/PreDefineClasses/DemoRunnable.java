package PreDefineClasses;

public class DemoRunnable {
    public static void main(String[] args) {
    class Worker implements Runnable{
        @Override
        public void run(){
            System.out.println("runnable traditional way ");
        }
    }
    Runnable runnable = new Worker();
    runnable.run();


    //anonymous class

        Runnable runnable1= new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable anonymous class way ");
            }
        };
        runnable1.run();

        //lambda Expression
        Runnable runnable2 = () -> System.out.println("lambda Expression");
        runnable2.run();

        //method ref
        class A{
            void display(){
                System.out.println("method reference ");
            }
        }
        A a = new A();
        Runnable runnable3 = a :: display;
        runnable3.run();
    }
}
