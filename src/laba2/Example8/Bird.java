package laba2.Example8;

public class Bird extends Animal {
    private boolean canFly;

     //Инициализирует птицу с заданным именем, возрастом и возможностью летать.
     //@param name имя птицы
     //@param age возраст птицы
     //@param canFly возможность летать
    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

     //Возвращает возможность летать.
     //@return возможность летать
    public boolean getCanFly() {
        return canFly;
    }

     //Издает звук.
    @Override
    public void makeSound() {
        System.out.println("Птица чирикает");
    }
}