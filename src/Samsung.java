public class Samsung implements CommonCalculations{
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
    // return wanted power of wanted numerical data and square root for samsung only
    public double power (double a, double b){
        return Math.pow(a,b);
    }
    public  double squareRoot (double a){
        return Math.sqrt(a);
    }
}
