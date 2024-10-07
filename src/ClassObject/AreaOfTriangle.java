package ClassObject;

public class AreaOfTriangle {
    int side1;
    int side2;
    int side3;

    public AreaOfTriangle(){
        this.side1=2;
        this.side2=3;
        this.side3=4;
    }
    public int calculatePerimeter(){
        return side1+side2+side3;
    }
    public double CalculateArea(){
        double s= side1+side2+side3/2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public void display(){
        System.out.println("perimeter of triangle is "+calculatePerimeter());
        System.out.println("area of triangle is "+CalculateArea());
    }
    public static void main(String[] args) {
        AreaOfTriangle tr = new AreaOfTriangle();
        tr.display();
    }
}
