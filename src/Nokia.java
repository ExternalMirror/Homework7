public class Nokia implements CommonCalculations {

    @Override
    public double addition(double a, double b) {return a + b;}

    @Override
    public double subtract(double a, double b) {return a - b;}

    @Override
    public double multiply(double a, double b) {return a*b;}

    @Override
    public double division(double a, double b) {
        if (b == 0){
            throw new  ArithmeticException();
        }
        return a/b;
    }
    public double exponential(double a){
        return Math.exp(a);
    }
}
