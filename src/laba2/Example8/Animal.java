package laba2.Example8;

public class Animal {
    private String name;
    private int age;

     //Инициализирует животное с заданным именем и возрастом.
     //@param name имя животного
     //@param age возраст животного
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

     //Возвращает имя животного.
     //@return имя животного
    public String getName() {
        return name;
    }

     //Возвращает возраст животного.
     //@return возраст животного
    public int getAge() {
        return age;
    }

     //Издает звук.
    public void makeSound() {
        System.out.println("Животное издает звук");
    }
}
