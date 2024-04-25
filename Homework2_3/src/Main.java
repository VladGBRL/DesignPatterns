
public class Main {
    public static void main(String[] args) {
        ComplexNumber nr1 = new ComplexNumber(2, 3);
        ComplexNumber nr2 = new ComplexNumber(1, 2);
        double double1 = 2.5;
        double double2 = 1.5;

        // ComplexNumber suma(ComplexNumber nr1, ComplexNumber nr2)
        ComplexNumber result1 = nr1.add(nr2);
        System.out.println("Sum of complex numbers: " + result1.getReal() + " + " + result1.getImaginary() + "i");

        // ComplexNumber suma(Double nr1, Double nr2)
        ComplexNumber result2 = DoubleToComplexAdapter.adapt(double1).add(DoubleToComplexAdapter.adapt(double2));
        System.out.println("Sum of doubles converted to complex numbers: " + result2.getReal() + " + " + result2.getImaginary() + "i");

        // ComplexNumber suma(ComplexNumber nr1, Double nr2)
        ComplexNumber result3 = nr1.add(DoubleToComplexAdapter.adapt(double2));
        System.out.println("Sum of a complex number and a double converted to complex number: " + result3.getReal() + " + " + result3.getImaginary() + "i");

        // ComplexNumber suma(Double nr2, ComplexNumber nr2)
        ComplexNumber result4 = DoubleToComplexAdapter.adapt(double2).add(nr2);
        System.out.println("Sum of a double converted to complex number and a complex number: " + result4.getReal() + " + " + result4.getImaginary() + "i");

        ComplexNumber nr4 = new ComplexNumber(3, 4);
        Double rezultat4 = ComplexToDoubleAdapter.adapt(nr4);
        System.out.println("The module of the complex number is: " + rezultat4);
    }
}
