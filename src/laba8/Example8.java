package laba8;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;

public class Example8 {

    private static final String FILE_PATH = "src/laba8/animals.xml";

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            File inputFile = new File(FILE_PATH);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            while (true) {
                System.out.println("\nВыберите действие:");
                System.out.println("1 - Показать всех животных");
                System.out.println("2 - Добавить животное");
                System.out.println("3 - Поиск по типу");
                System.out.println("4 - Поиск по возрасту");
                System.out.println("5 - Удалить по имени");
                System.out.println("0 - Выход");
                System.out.print("Ваш выбор: ");

                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        showAllAnimals(doc);
                        break;
                    case 2:
                        addNewAnimal(doc, scanner);
                        saveXML(doc);
                        break;
                    case 3:
                        searchAnimalsByType(doc, scanner);
                        break;
                    case 4:
                        searchAnimalsByAge(doc, scanner);
                        break;
                    case 5:
                        deleteAnimalByName(doc, scanner);
                        saveXML(doc);
                        break;
                    case 0:
                        System.out.println("Выход...");
                        return;
                    default:
                        System.out.println("Неверный выбор.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void showAllAnimals(Document doc) {
        NodeList nodeList = doc.getElementsByTagName("animal");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element element = (Element) nodeList.item(i);
            System.out.println("\nЖивотное #" + (i + 1));
            System.out.println("Имя: " + element.getElementsByTagName("name").item(0).getTextContent());
            System.out.println("Тип: " + element.getElementsByTagName("type").item(0).getTextContent());
            System.out.println("Возраст: " + element.getElementsByTagName("age").item(0).getTextContent());
        }
    }

    private static void addNewAnimal(Document doc, Scanner scanner) {
        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();
        System.out.print("Введите тип животного: ");
        String type = scanner.nextLine();
        System.out.print("Введите возраст: ");
        String age = scanner.nextLine();

        Element root = doc.getDocumentElement();
        Element animal = doc.createElement("animal");

        Element nameElement = doc.createElement("name");
        nameElement.appendChild(doc.createTextNode(name));
        animal.appendChild(nameElement);

        Element typeElement = doc.createElement("type");
        typeElement.appendChild(doc.createTextNode(type));
        animal.appendChild(typeElement);

        Element ageElement = doc.createElement("age");
        ageElement.appendChild(doc.createTextNode(age));
        animal.appendChild(ageElement);

        root.appendChild(animal);

        System.out.println("Животное добавлено.");
    }

    private static void searchAnimalsByType(Document doc, Scanner scanner) {
        System.out.print("Введите тип животного (например, 'Кот'): ");
        String typeQuery = scanner.nextLine();
        filterAndPrint(doc, "type", typeQuery);
    }

    private static void searchAnimalsByAge(Document doc, Scanner scanner) {
        System.out.print("Введите возраст животного: ");
        String ageQuery = scanner.nextLine();
        filterAndPrint(doc, "age", ageQuery);
    }

    private static void deleteAnimalByName(Document doc, Scanner scanner) {
        System.out.print("Введите имя животного для удаления: ");
        String nameQuery = scanner.nextLine();

        NodeList nodeList = doc.getElementsByTagName("animal");
        boolean found = false;

        for (int i = 0; i < nodeList.getLength(); i++) {
            Element element = (Element) nodeList.item(i);
            String name = element.getElementsByTagName("name").item(0).getTextContent();
            if (name.equalsIgnoreCase(nameQuery)) {
                Node parent = element.getParentNode();
                parent.removeChild(element);
                found = true;
                System.out.println("Животное удалено.");
                break;
            }
        }

        if (!found) {
            System.out.println("Животное с таким именем не найдено.");
        }
    }

    private static void filterAndPrint(Document doc, String tag, String value) {
        NodeList nodeList = doc.getElementsByTagName("animal");
        List<Element> results = new ArrayList<>();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Element element = (Element) nodeList.item(i);
            String text = element.getElementsByTagName(tag).item(0).getTextContent();
            if (text.equalsIgnoreCase(value)) {
                results.add(element);
            }
        }

        if (results.isEmpty()) {
            System.out.println("Животных не найдено.");
        } else {
            for (Element e : results) {
                System.out.println("\nИмя: " + e.getElementsByTagName("name").item(0).getTextContent());
                System.out.println("Тип: " + e.getElementsByTagName("type").item(0).getTextContent());
                System.out.println("Возраст: " + e.getElementsByTagName("age").item(0).getTextContent());
            }
        }
    }

    private static void saveXML(Document doc) throws TransformerException {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(FILE_PATH));
        transformer.transform(source, result);
        System.out.println("Файл успешно обновлён.");
    }
}
