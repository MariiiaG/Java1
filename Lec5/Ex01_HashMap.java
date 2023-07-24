package Java1.Lec5;

/*
 * HashMap
Map – это множество коллекций, работающих с данными по принципу <Ключ / Значение>.
Ключевые особенности:
● ускоренная обработка данных;
● порядок добавления не запоминается.
● допускаются только уникальные ключи, значения могут повторяться;
● помните про null значения* (может использоваться в качестве ключа, это "путсая ссылка")
В HashMap элементы располагаются как угодно и могут менять свое положение.
 */

import java.util.*;

public class Ex01_HashMap {
       public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>(); // int for key and string for value
        db.putIfAbsent(1, "один"); // will only add if such key hasn't been used yet 
        db.put(2, "два"); 
        db.put(null, "!null"); 
        System.out.println(db); // {null=!null, 1=один, 2=два}
        System.out.println(db.get(44));
        db.remove(null); 
        System.out.println(db); // {1=один, 2=два}
        System.out.println(db.containsValue("один")); // true
        System.out.println(db.containsValue(1)); // false
        System.out.println(db.containsKey("один")); // false
        System.out.println(db.containsKey(1)); // true
        System.out.println(db.keySet()); // [1, 2]
        System.out.println(db.values()); // [один, два]
    }
}

/*
 * put(K,V) – добавить пару или изменить значение,если ключ имеется. 
 * putIfAbsent(K,V) – произвести добавление если ключ не найден.
 * get(K) - получение значения по указанному ключу.
 * remove(K) – удаляет пару по указанному ключу.
 * containsValue(V) – проверка наличия значения. 
 * containsKey(V) – проверка наличия ключа. 
 * keySet() – возвращает множество ключей.
 * values() – возвращает набор значений.
 */
