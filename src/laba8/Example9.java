package laba8;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Example9 {
    private static final String FILE_PATH = "src/laba8/animals.json";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(FILE_PATH));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("animals");

            while (true) {
                System.out.println("\nВыберите действие:");
                System.out.println("1 - Показать всех животных");
                System.out.println("2 - Добавить животное");
                System.out.println("3 - Поиск по типу");
                System.out.println("4 - Удалить по имени");
                System.out.println("0 - Выход");
                System.out.print("Ваш выбор: ");
                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        showAllAnimals(jsonArray);
                        break;
                    case "2":
                        addAnimal(jsonArray, scanner);
                        saveJson(jsonObject);
                        break;
                    case "3":
                        searchByType(jsonArray, scanner);
                        break;
                    case "4":
                        deleteByName(jsonArray, scanner);
                        saveJson(jsonObject);
                        break;
                    case "0":
                        System.out.println("Выход...");
                        return;
                    default:
                        System.out.println("Неверный ввод.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void showAllAnimals(JSONArray jsonArray) {
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject animal = (JSONObject) jsonArray.get(i);
            System.out.println("\nЖивотное #" + (i + 1));
            System.out.println("Имя: " + animal.get("name"));
            System.out.println("Тип: " + animal.get("type"));
            System.out.println("Возраст: " + animal.get("age"));
        }
    }

    private static void addAnimal(JSONArray jsonArray, Scanner scanner) {
        JSONObject newAnimal = new JSONObject();

        System.out.print("Введите имя животного: ");
        newAnimal.put("name", scanner.nextLine());

        System.out.print("Введите тип животного: ");
        newAnimal.put("type", scanner.nextLine());

        System.out.print("Введите возраст: ");
        newAnimal.put("age", Integer.parseInt(scanner.nextLine()));

        jsonArray.add(newAnimal);
        System.out.println("Животное добавлено.");
    }

    private static void searchByType(JSONArray jsonArray, Scanner scanner) {
        System.out.print("Введите тип животного для поиска: ");
        String searchType = scanner.nextLine();
        boolean found = false;

        for (Object obj : jsonArray) {
            if (obj instanceof JSONObject) {
                JSONObject animal = (JSONObject) obj;
                String type = (String) animal.get("type");
                if (searchType.equalsIgnoreCase(type)) {
                    System.out.println("\nНайдено животное:");
                    System.out.println("Имя: " + animal.get("name"));
                    System.out.println("Тип: " + animal.get("type"));
                    System.out.println("Возраст: " + animal.get("age"));
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Животные данного типа не найдены.");
        }
    }

    private static void deleteByName(JSONArray jsonArray, Scanner scanner) {
        System.out.print("Введите имя животного для удаления: ");
        String nameToDelete = scanner.nextLine();
        Iterator iterator = jsonArray.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            JSONObject animal = (JSONObject) iterator.next();
            if (nameToDelete.equalsIgnoreCase((String) animal.get("name"))) {
                iterator.remove();
                found = true;
                System.out.println("Животное удалено.");
                break;
            }
        }

        if (!found) {
            System.out.println("Животное с таким именем не найдено.");
        }
    }

    private static void saveJson(JSONObject jsonObject) {
        try (FileWriter file = new FileWriter(FILE_PATH)) {
            file.write(jsonObject.toJSONString());
            file.flush();
            System.out.println("Изменения сохранены.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
