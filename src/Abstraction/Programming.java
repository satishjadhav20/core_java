package Abstraction;

public abstract class Programming {
    public abstract void Developer();
}
class HtMl extends Programming{
    @Override
    public void Developer(){
        System.out.println("HTML Dev Sushant Shintre");
    }
}
class Java extends Programming{
    @Override
    public void Developer(){
        System.out.println("Java Dev Digvijay Tambekar");
    }
}
class JavaScript extends Programming{
    @Override
    public void Developer(){
        System.out.println("Js Dev Vishwadeep Tanugade");
    }
}
class Kotlin extends Programming{
    @Override
    public void Developer(){
        System.out.println("Kotlin Dev Satish Jadhav");
    }
}
class Main{
    public static void main(String[] args) {
       HtMl h = new HtMl();
       h.Developer();
       Java j = new Java();
       j.Developer();
       JavaScript js = new JavaScript();
       js.Developer();
       Kotlin k = new Kotlin();
       k.Developer();
    }
}
