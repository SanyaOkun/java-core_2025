package laba2.Example6;

public class Circle implements Shape {
    private double radius;

     //Инициализирует круг с заданным радиусом.
     //@param radius радиус круга
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }
}