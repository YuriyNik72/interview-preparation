package oop;

public class Triangle extends Figure{

    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c){
        if(a+b>c && b+c>a && a+c>b){
            this.a = a;
            this.b = b;
            this.c = c;
        }else {
            throw new RuntimeException("Это не треугольник");
        }
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    @Override
    public double square(){
        double d = perimetr()/2;
        return Math.sqrt(d*(d-a)*(d-b)*(d-c));
    }
    @Override
    public double perimetr(){
        return a + b + c;
    }
}
