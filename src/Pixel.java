public class Pixel implements CommonCalculations{
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
    // all this four is return of trigonometry for pixel only
    public double sinus (double a){
        double sinRadian = Math.toRadians(a);
        return Math.sin(sinRadian);
    }
    public double cosines(double a){
        double cosRadian = Math.toRadians(a);
        return Math.cos(cosRadian);
    }
    public double tangents (double a){
        double tanRadian = Math.toRadians(a);
        return Math.tan(tanRadian);
    }
    public double cotangents(double a){
        double cotanRadian = Math.toRadians(a);
        return 1/Math.tan(cotanRadian);
    }
}
