package laba2.Example8;

public class Square extends Shape {
    private double sideLength;

     //Инициализирует квадрат с заданной длиной стороны.
     //@param sideLength длина стороны квадрата
    public Square(double sideLength) {
        super("Квадрат");
        this.sideLength = sideLength;
    }

     //Возвращает длину стороны квадрата.
     //@return длина стороны квадрата
    public double getSideLength() {
        return sideLength;
    }

     //Вычисляет площадь квадрата.
     //@return площадь квадрата
    @Override
    public double calculateArea() {
        return Math.pow(sideLength, 2);
    }

     //Вычисляет периметр квадрата.
     //@return периметр квадрата
    @Override
    public double calculatePerimeter() {
        return 4 * sideLength;
    }
}
