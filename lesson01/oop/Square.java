package oop;

public class Square extends Figure {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    @Override
    public double square(){
        return side * side;
    }
    @Override
    public double perimetr(){
        return (side + side) * 2;
    }
}
