package pr10.Complex;

public class ComplexTest {
    public static void main(String[] args) {
        Complex a = new Complex(45, 9);
        System.out.println(a);

        ComplexAbstractFactory b = new ConcreteFactory();
        Complex c = b.createComplex(564, 453);
        System.out.println(c);

        ConcreteFactory d = new ConcreteFactory();
        Complex f = d.createComplex();
        System.out.println(f);
    }
}
