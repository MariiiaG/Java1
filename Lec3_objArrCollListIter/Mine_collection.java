package Java1.Lec3_objArrCollListIter;

import java.util.ArrayList;

/*
 * Иерархия коллекций. ArrayList
«Удобный массив»
Разные способы создания
ArrayList list = new ArrayList();
Разные способы создания
ArrayList<Integer> list1 = new ArrayList<Integer>(); // not neccessary to identify as Int in the 2nd instance
ArrayList<Integer> list2 = new ArrayList<>();
ArrayList<Integer> list3 = new ArrayList<>(10); // will create an initial arr of 10 el, but can be expanded
ArrayList<Integer> list4 = new ArrayList<>(list3); // copies data from another list

Иерархия коллекций. List
List – пронумерованный набор элементов.
Пользователь этого интерфейса имеет точный контроль над тем,
где в списке вставляется каждый элемент.
Пользователь может обращаться к элементам по их целочисленному индексу (позиции в списке) 
и искать элементы в списке.
 */

public class Mine_collection {
    // public static void main(String[] args) {  // example of raw type collection
    //     ArrayList list = new ArrayList();
    //     list.add(2809); // haven't defined the data type here, so further on it will be treated as an object
    //     list.add("string line"); // string data also works, as the object down the line will accept it

    //     for (Object o : list) { 
    //         System.out.println(o);  // 2809 \n string line
    //     }
    //  }
     public static void main(String[] args) {  // Example of Save Type
        ArrayList<Integer>list = new ArrayList<Integer>(); // predefined data type as Int
        list.add(2809); 
        //list.add("string line"); // will throw an exception

        for (Object o : list) { 
            System.out.println(o);
        }
    } // bettter stick to this method, so as to avoid potential errors in the code
    // Ошибки на этапе коипиляции лучше ошибок времени выполнения
}


/*
 * add(args) – добавляет элемент в список ( в т.ч. на нужную позицию) 
 * get(pos) – возвращает элемент из списка по указанной позиции 
 * indexOf(item) – первое вхождение или -1
 * lastIndexOf(item) – последнее вхождение или -1
 * remove(pos) – удаление элемента на указанной позиции и его возвращение
 * void sort(Comparator) – сортирует набор данных по правилу
 * subList(int start, int end) – получение набора данных от позиции start до end
 */