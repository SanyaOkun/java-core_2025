package laba2.Example6;
public class Example6 {
    public static void main(String[] args) {
        // Создание объектов фигур
        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        // Вычисление и вывод площади и периметра каждой фигуры
        System.out.println("Круг:");
        System.out.println("Площадь: " + circle.calculateArea());
        System.out.println("Периметр: " + circle.calculatePerimeter());

        System.out.println("\nКвадрат:");
        System.out.println("Площадь: " + square.calculateArea());
        System.out.println("Периметр: " + square.calculatePerimeter());

        System.out.println("\nТреугольник:");
        System.out.println("Площадь: " + triangle.calculateArea());
        System.out.println("Периметр: " + triangle.calculatePerimeter());
    }
}
