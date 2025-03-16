package laba2.Example5;
//Example5
public class Rectangle {
    private double length;
    private double width;

    // Конструктор
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Методы сеттеры (установка значений)
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Методы геттеры (получение значений)
    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    // Метод для вычисления площади
    public double calculateArea() {
        return this.length * this.width;
    }

    // Метод для вычисления периметра
    public double calculatePerimeter() {
        return 2 * (this.length + this.width);
    }
}
