package laba2.Example8;

public class Cat extends Animal {
    private String foodType;

     //Инициализирует кошку с заданным именем, возрастом и типом корма.
     //@param name имя кошки
     //@param age возраст кошки
     //@param foodType тип корма кошки
    public Cat(String name, int age, String foodType) {
        super(name, age);
        this.foodType = foodType;
    }

     //Возвращает тип корма кошки.
     //@return тип корма кошки
    public String getFoodType() {
        return foodType;
    }

     //Издает звук.
    @Override
    public void makeSound() {
        System.out.println("Кошка мяукает");
    }
}
