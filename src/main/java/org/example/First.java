//Тарасов Алексей, группа 4992

// Реализовать алгоритм сортировки списков компаратором.

//(Свой компаратор создать не получилось - выдаёт ошибку, хоть сделано всё так, как на семинаре показано)
package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class First {
    public static void main(String[] args) {
        ArrayList ar = newArray();
        print(ar);
        ar.sort(Comparator.naturalOrder());
        print(ar);
    }


    // Метод создания списка
    public static ArrayList<Integer> newArray(){
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 20; i++) array.add(new Random().nextInt(100));
        return array;
    }

    // Метод для вывода в консоль
    public static void print(Object smth){
        System.out.println(smth);
    }

}
