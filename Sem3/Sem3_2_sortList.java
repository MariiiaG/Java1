package Java1.Sem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Заполнить список десятью случайными числами.
 * ОТсортировать список методом sort() и вывести его на экран
 */
public class Sem3_2_sortList {
    public static void main(String[] args) {
        // List<Integer> list = List.of(7, 5, 4, 5, 10); //can't change this list, can't sort either
        Integer[] arr = new Integer[]{5, 7, 0, 2, 6, 2}; //  created an array
        List<Integer> list = new ArrayList<>(Arrays.asList(arr)); // Arrays.asList helps to turn arr into list
        list.sort(null);
        System.out.println(list); // [0, 2, 2, 5, 6, 7]
    }
}
