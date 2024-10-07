package ClassObject;

public class Triangle {
        int side1;
        int side2;
        int side3;

        public Triangle(int side1,int side2, int side3){
            this.side1=side1;
            this.side2=side2;
            this.side3=side3;
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
            Triangle t = new Triangle(2,3,4);
            t.display();

        }
    }

