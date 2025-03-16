package laba2.Example8;

public class Circle extends Shape {
    private double radius;

     //Инициализирует круг с заданным радиусом.
     //@param radius радиус круга
    public Circle(double radius) {
        super("Круг");
        this.radius = radius;
    }

     //Возвращает радиус круга.
     //@return радиус круга
    public double getRadius() {
        return radius;
    }

     //Вычисляет площадь круга.
     //@return площадь круга
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

     //Вычисляет периметр круга.
     //@return периметр круга
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}