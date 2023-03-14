//Тарасов Алексей, группа 4992

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Third {
    public static void main(String[] args) {
        ArrayList<Integer> arr = newArray();
        print(arr + "\n");
        maxAndMin(arr);
    }

    // Метод создания списка
    public static ArrayList<Integer> newArray() {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 21; i++) array.add(new Random().nextInt(100));
        return array;
    }

    // Метод для вывода в консоль
    public static void print(Object smth){
        System.out.print(smth);
    }
    // Метод поиска максимального и минимального значений
    public static void maxAndMin(ArrayList<Integer> smth){
        print("Максимальное значение списка - " + Collections.max(smth) + "\n");
        print("Минимальное значение списка - " + Collections.min(smth));
    }
}
