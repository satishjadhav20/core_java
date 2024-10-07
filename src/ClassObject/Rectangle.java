package ClassObject;
import java.util.Scanner;
public class Rectangle {
    double length;
    double breadth;
    public void setDimension(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public  double getArea(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();

        System.out.println("enter the length of the rectangle");
        double length = sc.nextDouble();

        System.out.println("enter the breadth of the rectangle");
        double breadth = sc.nextDouble();

        r.setDimension(length,breadth);
         double area=r.getArea();
        System.out.println("the area of the rectangle is "+area);

    }
}
