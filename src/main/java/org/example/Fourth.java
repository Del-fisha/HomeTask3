//Тарасов Алексей, группа 4992

// Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Fourth {
    public static void main(String[] args) {
        ArrayList<Integer> arr = newArray();
        ArrayList<Integer> arr2 = newArray();
        print(arr + "\n");
        print(arr2 + "\n");
        print(joinArr(arr, arr2));
    }
    // Метод создания списка
    public static ArrayList<Integer> newArray() {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) array.add(new Random().nextInt(50));
        return array;
    }

    // Метод для вывода в консоль
    public static void print(Object smth){
        System.out.print(smth);
    }
    //Метод объединения
    public static ArrayList<Integer> joinArr(ArrayList<Integer> smth, ArrayList<Integer> smth2){
        ArrayList<Integer> result = new ArrayList<>(smth);
        for (int num:smth2) {
            if(!smth.contains(num)) result.add(num);
        }
        return result;
    }
}
