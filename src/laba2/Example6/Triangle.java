package laba2.Example6;

public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;

     //Инициализирует треугольник с заданными длинами сторон.
     //@param sideA длина стороны A
     //@param sideB длина стороны B
     //@param sideC длина стороны C
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        // Формула Герона для вычисления площади
        double semiPerimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }
}
