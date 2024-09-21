package first.src.com.company;

class ComplexNumber {
    private double real;
    private double imag;

    public ComplexNumber() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public ComplexNumber(double r, double i) {
        this.real = r;
        this.imag = i;
    }

    public void display() {
        System.out.println(real + " + " + imag + "i");
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(real + other.real, imag + other.imag);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(real - other.real, imag - other.imag);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        ComplexNumber result = new ComplexNumber();
        result.real = (real * other.real) - (imag * other.imag);
        result.imag = (real * other.imag) + (imag * other.real);
        return result;
    }
}

public class Complex
{
    public static void main(String[] args) 
    {
        ComplexNumber a = new ComplexNumber(3.0, 4.0);
        ComplexNumber b = new ComplexNumber(1.5, 2.5);

        System.out.print("ComplexNumber number a: ");
        a.display();

        System.out.print("ComplexNumber number b: ");
        b.display();

        ComplexNumber sum = a.add(b);
        System.out.print("Sum (a + b): ");
        sum.display();

        ComplexNumber difference = a.subtract(b);
        System.out.print("Difference (a - b): ");
        difference.display();

        ComplexNumber product = a.multiply(b);
        System.out.print("Product (a * b): ");
        product.display();
    }
}
