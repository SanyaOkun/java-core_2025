package laba2.Example8;

public class Example8 {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик", 3, "Лабрадор");
        Cat cat = new Cat("Вася", 2, "Сухой корм");
        Bird bird = new Bird("Кеша", 1, true);

        System.out.println("Имя собаки: " + dog.getName());
        System.out.println("Возраст собаки: " + dog.getAge());
        System.out.println("Порода собаки: " + dog.getBreed());
        dog.makeSound();

        System.out.println("\nИмя кошки: " + cat.getName());
        System.out.println("Возраст кошки: " + cat.getAge());
        System.out.println("Тип корма кошки: " + cat.getFoodType());
        cat.makeSound();

        System.out.println("\nИмя птицы: " + bird.getName());
        System.out.println("Возраст птицы: " + bird.getAge());
        System.out.println("Может ли птица летать: " + bird.getCanFly());
        bird.makeSound();

        Circle circle = new Circle(5);
        Square square = new Square(4);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("\nИмя фигуры: " + circle.getName());
        System.out.println("Радиус круга: " + circle.getRadius());
        System.out.println("Площадь круга: " + circle.calculateArea());
        System.out.println("Периметр круга: " + circle.calculatePerimeter());

        System.out.println("\nИмя фигуры: " + square.getName());
        System.out.println("Длина стороны квадрата: " + square.getSideLength());
        System.out.println("Площадь квадрата: " + square.calculateArea());
        System.out.println("Периметр квадрата: " + square.calculatePerimeter());

        System.out.println("\nИмя фигуры: " + triangle.getName());
        System.out.println("Длина стороны A треугольника: " + triangle.getSideA());
        System.out.println("Длина стороны B треугольника: " + triangle.getSideB());
        System.out.println("Длина стороны C треугольника: " + triangle.getSideC());
        System.out.println("Площадь треугольника: " + triangle.calculateArea());
        System.out.println("Периметр треугольника: " + triangle.calculatePerimeter());
    }
}
