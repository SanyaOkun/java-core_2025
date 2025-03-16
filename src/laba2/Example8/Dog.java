package laba2.Example8;

public class Dog extends Animal {
    private String breed;

     //Инициализирует собаку с заданным именем, возрастом и породой.
     //@param name имя собаки
     //@param age возраст собаки
     //@param breed порода собаки
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

     //Возвращает породу собаки.
     //@return порода собаки
    public String getBreed() {
        return breed;
    }

     //Издает звук.
    @Override
    public void makeSound() {
        System.out.println("Собака лает");
    }
}