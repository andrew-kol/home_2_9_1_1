package hw1.Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Петя Васин", "+79853056644");
        phoneBook.put("Саша Красин", "+79853056644");
        phoneBook.put("Ира Люка", "+79865256644");
        phoneBook.put("Поля Штука", "+79853985644");
        phoneBook.put("Яков Малый", "+7985301524");
        phoneBook.put("Лев Удалый", "+7985301524");
        phoneBook.put("Игорь Полный", "+79853056644");
        phoneBook.put("Марк Престольный", "+79853056644");
        phoneBook.put("Вова Дядин", "+79865256644");
        phoneBook.put("Миша Задин", "+79853985644");
        phoneBook.put("Таня Зода", "+7989865524");
        phoneBook.put("Маня Шкода", "+79325401524");
        phoneBook.put("Ленка Пенка", "+79853056644");
        phoneBook.put("Джон Коленка", "+79853056644");
        phoneBook.put("Дядя Штирлиц", "+79865256644");
        phoneBook.put("Тётя Тирпиц", "+79853985644");
        phoneBook.put("Брат Редиска", "+7985301524");
        phoneBook.put("Танцор Диско", "+7985301524");
        phoneBook.put("Громкий Рупор", "+79853056644");
        phoneBook.put("Страшный Ступор", "+79853056644");

        Set<String> keys = phoneBook.keySet();
        ArrayList<String> values = new ArrayList<>(phoneBook.values());

        System.out.println("phoneBook = " + phoneBook);
        System.out.println("keys = " + keys);
        System.out.println("Значения: " + values);

    }
}