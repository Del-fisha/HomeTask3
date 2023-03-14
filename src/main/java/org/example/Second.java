//Тарасов Алексей, группа 4992

// Пусть дан произвольный список целых чисел, удалить из него чётные числа
package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Second {
    public static void main(String[] args) {
        ArrayList<Integer> arr = newArray();
        print(arr + "\n");
        print(getOdd(arr));
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

    // Метод для удаления чётных чисел
    public static ArrayList<Integer> getOdd(ArrayList<Integer> smth){
        smth.removeIf(n -> (n % 2 == 0));
        return smth;
    }
}
