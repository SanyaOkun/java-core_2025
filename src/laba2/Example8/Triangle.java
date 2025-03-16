package laba2.Example8;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

     //Инициализирует треугольник с заданными длинами сторон.
     //@param sideA длина стороны A
     //@param sideB длина стороны B
     //@param sideC длина стороны C
    public Triangle(double sideA, double sideB, double sideC) {
        super("Треугольник");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

     //Возвращает длину стороны A треугольника.
     //@return длина стороны A треугольника
    public double getSideA() {
        return sideA;
    }

     //Возвращает длину стороны B треугольника.
     //@return длина стороны B треугольника
    public double getSideB() {
        return sideB;
    }

     //Возвращает длину стороны C треугольника.
     //@return длина стороны C треугольника
    public double getSideC() {
        return sideC;
    }

     //Вычисляет площадь треугольника.
     //@return площадь треугольника
    @Override
    public double calculateArea() {
        double semiPerimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }

     //Вычисляет периметр треугольника.
     //@return периметр треугольника
    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}