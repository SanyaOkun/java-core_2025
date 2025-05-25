package laba7;

import java.io.*;
import java.util.Scanner;

class Persona implements Serializable {
    private String name;
    private int age;
    private String address;

    public Persona(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Введите возраст: ");
        int age = in.nextInt();
        in.nextLine();
        System.out.print("Введите адрес: ");
        String address = in.nextLine();
        System.out.print("Введите путь к файлу: ");
        String fileName = in.nextLine();

        Persona persona = new Persona(name, age, address);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(persona);
        } catch (IOException e) {
            System.out.println("Ошибка при записи объекта в файл");
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Persona restoredPersona = (Persona) ois.readObject();
            System.out.println("Объект восстановлен из файла");
            System.out.println("Имя: " + restoredPersona.getName());
            System.out.println("Возраст: " + restoredPersona.getAge());
            System.out.println("Адрес: " + restoredPersona.getAddress());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при восстановлении объекта из файла");
        }
        in.close();
    }
}
