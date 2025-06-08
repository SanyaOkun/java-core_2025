package laba8;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class Example10 {
    private static final String URL = "https://66.ru/";
    private static final String FILE_PATH = "src/laba8/news.txt";

    public static void main(String[] args) {
        Document doc = null;
        int attempts = 0;
        final int maxAttempts = 3;

        while (doc == null && attempts < maxAttempts) {
            try {
                doc = Jsoup.connect(URL).get();
            } catch (IOException e) {
                attempts++;
                System.out.println("Ошибка подключения (попытка " + attempts + " из " + maxAttempts + ")");
                if (attempts == maxAttempts) {
                    System.out.println("Не удалось подключиться к сайту после нескольких попыток.");
                    return;
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        }

        if (doc == null) {
            System.out.println("Документ не загружен.");
            return;
        }

        Elements newsBlocks = doc.select("a[href*='/news/']");
        System.out.println("Найдено новостей по селектору: " + newsBlocks.size());

        if (newsBlocks.isEmpty()) {
            System.out.println("Новости не найдены. Проверь селектор или проверь, не динамический ли контент на сайте.");
            return;
        }

        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            int count = Math.min(10, newsBlocks.size());
            for (int i = 0; i < count; i++) {
                Element news = newsBlocks.get(i);
                String title = news.text();
                String link = news.absUrl("href");

                System.out.println("Новость: " + title);
                System.out.println("Ссылка: " + link + "\n");

                writer.write("Новость: " + title + "\n");
                writer.write("Ссылка: " + link + "\n\n");
            }
            System.out.println("Новости успешно записаны в файл: " + FILE_PATH);
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}

