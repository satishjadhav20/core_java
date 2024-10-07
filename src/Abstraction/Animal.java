package Abstraction;

 abstract public class Animal {
     Animal(){
         System.out.println("all the animal....!");
     }
    public abstract void sound();
}
class Lion extends Animal{
     Lion(){
         super();
     }
     public void sound(){
         System.out.println("lion is roar");
     }
}
class Dog extends Animal{

    public void sound(){
        System.out.println("Dog is barking");
    }
    Dog(){
        super();
    }
}
class Test{
    public static void main(String[] args) {
        Lion l = new Lion();
        Dog d = new Dog();
        l.sound();
        d.sound();
    }
 }
