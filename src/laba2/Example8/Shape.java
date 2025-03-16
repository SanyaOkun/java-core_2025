package laba2.Example8;

public class Shape {
    private String name;

     //Инициализирует фигуру с заданным именем.
     //@param name имя фигуры
    public Shape(String name) {
        this.name = name;
    }

     //Возвращает имя фигуры.
     //@return имя фигуры
    public String getName() {
        return name;
    }

     //Вычисляет площадь фигуры.
     //@return площадь фигуры
    public double calculateArea() {
        return 0;
    }

     //Вычисляет периметр фигуры.
     //@return периметр фигуры
    public double calculatePerimeter() {
        return 0;
    }
}