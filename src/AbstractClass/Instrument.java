package AbstractClass;

abstract class Instrument {
    abstract void play();
}
class  Piano extends Instrument{
@Override
    void play(){
    System.out.println(" playing tan tan tan tan for Piano class");
}
}
class  Flute extends Instrument{
@Override
    void play(){
    System.out.println("playing toot toot toot toot” for Flute class");
}
}
class Guitar extends Instrument{
    @Override
    void play(){
        System.out.println("is playing tin tin tin ” for Guitar class");
    }
}
class Instruments {
    public static void main(String[] args) {
        Instrument[] instrumentArray = new Instrument[8];
        instrumentArray[0] = new Piano();
        instrumentArray[1] = new Guitar();
        instrumentArray[2] = new Flute();

        for (Instrument instrument : instrumentArray) {
            if (instrument != null) {
                instrument.play();
            }
        }

        String[] instrumentNames = {"Piano", "Guitar", "Flute", "Violin", "Drum", "Harp", "Trumpet", "Cello"};
        for (int i = 0; i < instrumentArray.length; i++) {
            if (instrumentArray[i] != null) {
                if (instrumentArray[i] instanceof Piano) {
                    System.out.println("Index " + i + " contains a Piano");
                } else if (instrumentArray[i] instanceof Guitar) {
                    System.out.println("Index " + i + " contains a Guitar");
                } else if (instrumentArray[i] instanceof Flute) {
                    System.out.println("Index " + i + " contains a Flute");
                }
            }
            else {
                System.out.println("Index " + i + " is empty");
            }
        }
    }
}
