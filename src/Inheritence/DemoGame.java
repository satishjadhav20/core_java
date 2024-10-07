package Inheritence;
class Game{
    int PId;
    String Pname;
    Game(){
        this.PId=0;
        this.Pname="null";
    }
}
class Boardgame extends  Game{
    Boardgame(){
        super();
    }
}
class Chess extends Boardgame{
    Chess(){
        super();
    }
}
public class DemoGame {
    public static void main(String[] args) {
        Chess ch = new Chess();
        System.out.println(ch.PId=1);
        System.out.println(ch.Pname="satish");
    }
}
