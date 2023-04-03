package org.example;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        List<Integer> strings1 = new ArrayList<>();
        removeEvenNumber(strings);
        removeIntegers(strings);
    }

    static void removeEvenNumber(List<String> strings) {
        // TODO: 31.03.2023 Удалить все четные элементы из списка
        for (int i = 0; i < strings.size(); i++) {
            try {
                int x = Integer.parseInt(strings.get(i));
                if (x % 2 == 0) {
                    strings.remove(i);
                }
            } catch (NumberFormatException e) {
            }

        }
        System.out.println(strings);
    }
    static void removeIntegers(List<String> strings) {
        // TODO: 31.03.2023 Удалить строки, которые являются целыми числами
        for (int i = 0; i < strings.size(); i++) {
            try {
                int x = Integer.parseInt(strings.get(i));
                {
                    strings.remove(i);
                }
            } catch (NumberFormatException e) {
            }

        }
        System.out.println(strings);
    }
}




