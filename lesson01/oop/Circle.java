package oop;

public class Circle extends Figure {

    private final double radius;

    public Circle (double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    @Override
    public double square(){
        return Math.PI * Math.pow(radius,2);
    }
    @Override
    public double perimetr(){
        return 2 * Math.PI * radius;
    }
}
