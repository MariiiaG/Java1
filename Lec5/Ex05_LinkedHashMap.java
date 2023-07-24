package Java1.Lec5;

/*
 * LinkedHashMap
«Старший брат» коллекции HashMap, который все помнит... 
Помнит порядок добавления элементов ➜ более медлительный

If execution speed is priority - use HashMap
If we need elements in order and do not bother about the speed - use LinkedHashMap
 */

import java.util.*;

public class Ex05_LinkedHashMap {
    public static void main(String[] args) {
        Map<Integer,String> linkmap = new LinkedHashMap<>();
        linkmap.put(11, "один один");
        linkmap.put(1, "два");
        linkmap.put(2, "один");
        System.out.println(linkmap); // {11=один один, 1=два, 2=один}
        
        Map<Integer,String> map = new HashMap<>();
        map.put(11, "один один");
        map.put(2, "два");
        map.put(1, "один");
        System.out.println(map); // {1=один, 2=два, 11=один один}
    }
}
