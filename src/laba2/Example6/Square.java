package laba2.Example6;

public class Square implements Shape {
    private double sideLength;

     //Инициализирует квадрат с заданной длиной стороны.
     //@param sideLength длина стороны квадрата
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideLength, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }
}
