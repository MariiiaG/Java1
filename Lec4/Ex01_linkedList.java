package Java1.Lec4;

import java.util.LinkedList;

/*
 * LinkedList
Представляет собой двусвязный список. Абстрактный тип данных.
Список – гибкая структура данных, позволяющая легко менять свой размер. 
Элементы доступны для вставки или удаления в любой позиции.
Чтобы обратиться к 10-му элементу списка нужно пройти через 9 предыдущих.
1 -> 2 -> 3 -> 4 -> 5 -> 6 ....

Когда надо часто удалять или добавлять элементы - лучше обычный список. 
Когда постоянно считываете данные - лучше массив.

В обычном списке мы знаем только то, что хранится в данном эементе + знаем о след элементе.
В двусвязном списке мы знаем о данном элементе + об элементе до и после него.

LinkedList нужен для небольшого количества элементов, 
в которых операции добавления\удаления встречаются чаще операций чтения.
 */

public class Ex01_linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();

        ll.add(1);
        ll.add(2);
        ll.add(3);
    }
}