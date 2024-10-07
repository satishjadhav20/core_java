package ClassObject;

import java.util.Scanner;
public class Complex {
    double real;
    double imaginary;
    public Complex(double real,double imaginary){
            this.real=real;
            this.imaginary=imaginary;
    }
    public Complex add( Complex other){
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    public Complex sub( Complex other){
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    public Complex mul( Complex other){
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realPart, imaginaryPart);
    }

    public void display() {
        if (imaginary >= 0) {
            System.out.printf("%.2f + %.2fi%n", real, imaginary);
        } else {
            System.out.printf("%.2f - %.2fi%n", real, -imaginary);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the real part of the first complex number:");
        double real1 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number:");
        double imaginary1 = scanner.nextDouble();

        System.out.println("Enter the real part of the second complex number:");
        double real2 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number:");
        double imaginary2 = scanner.nextDouble();

        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);

        Complex sum = c1.add(c2);
        Complex difference = c1.sub(c2);
        Complex product = c1.mul(c2);

        System.out.print("Sum: ");
        sum.display();

        System.out.print("Difference: ");
        difference.display();

        System.out.print("Product: ");
        product.display();
    }
}
