
public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double calculateModulus() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.getReal();
        double newImaginary = this.imaginary + other.getImaginary();
        return new ComplexNumber(newReal, newImaginary);
    }

    public static ComplexNumber fromDouble(double value) {
        return new ComplexNumber(value, 0);
    }

    public static double toDouble(ComplexNumber complexNumber) {
        return complexNumber.calculateModulus();
    }
}
