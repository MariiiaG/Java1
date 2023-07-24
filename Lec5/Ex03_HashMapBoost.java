package Java1.Lec5;

import java.util.*;

public class Ex03_HashMapBoost {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>(); // initial capacity - default
        Map<Integer,String> map2 = new HashMap<>(30);
        Map<Integer,String> map3 = new HashMap<>(30, 0.8f); 
    }
}

/*
 * The default initial capacity of the HashMap is 16. As the number of elements in the HashMap increases, 
 * the capacity is expanded. 
 * The load factor is the measure that decides when to increase the capacity of the Map. 
 * The default load factor is 75% of the capacity. See 3rd example here - set to 80% load factor. 
 * Use 1.0f for 100% load factor
 */