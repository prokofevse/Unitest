
package ru.kfc.autotest;

import java.util.*;

public class FirstElement {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("Телевизор", "Фен", "Телевизор", "Холодильник", "Телефон", "Фен");
        String uniqueItem = findFirstUnique(items);
        System.out.println("Первый неповторяющийся элемент: " + uniqueItem);
    }

    public static String findFirstUnique(List<String> list) {
        Map<String, Integer> countMap = new LinkedHashMap<>();
        for (String item : list) {
            if (countMap.containsKey(item)) {
                int count = countMap.get(item);
                countMap.put(item, count + 1);
                // Проходим по каждому элементу списка. Если есть такой элемент увеличиваем счётчик на 1
            } else {
                countMap.put(item, 1);
            }
            // Если не встречается оставляем изначальным
        }
        for (String item : list) {
            if (countMap.get(item) == 1) {
                return item;
                // Ищем самый первый элемент, у которого счётчик равен 1
            }
        }
        return null;
        // Если все элементы встречаются более одного раза, возвращаем null
    }
}