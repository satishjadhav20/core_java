package ClassObject;

public class Add_Distance {
    private int feet;
    private int inches;

    public Add_Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
        normalize();
    }

    private void normalize() {
        if (inches >= 12) {
            feet += inches / 12;
            inches = inches % 12;
        }
    }
    public Add_Distance add(Add_Distance other){
        int totalFeet = this.feet + other.feet;
        int totalInches = this.inches + other.inches;
        return new Add_Distance(totalFeet, totalInches);
    }

    public void display() {
        System.out.println(feet + " feet " + inches + " inches");
    }
}
class Test{
    public static void main(String[] args) {
        Add_Distance distance1 = new Add_Distance(5,9);
        Add_Distance distance2 = new Add_Distance(7,11);

        Add_Distance result = distance1.add(distance2);

        System.out.print("The sum of distances is: ");
        result.display();
    }
}
