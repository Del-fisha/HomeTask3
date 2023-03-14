// Тарасов Алексей, группа 4992

// 5. Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
// 6. Повторить пятый пункт но с LinkedList.
// 7. Сравнить время работы пятого и шестого пунктов.
package org.example;

import java.util.ArrayList;
import java.util.LinkedList;


public class Fifth {
    public static void main(String[] args) {

        print(newArray() + "\n");
        print(newArrayLinkedList());
    }
    // Метод создания списка через цикл
    public static ArrayList<Integer> newArray() {
        long startTime = System.currentTimeMillis();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            arr.add(0,0);
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        print("Эта программа выполнена за " + totalTime + " м/секунд: \n");
        return arr;
    }

    // Метод создания списка через LinkedList
    public static LinkedList<Integer> newArrayLinkedList(){
        long startTime = System.currentTimeMillis();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(0,0);
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        print("Эта программа выполнена за " + totalTime + " м/секунд: \n");
        return list;
    }


    //Метод для вывода в консоль
    public static void print(Object smth){
        System.out.print(smth);
    }
}
