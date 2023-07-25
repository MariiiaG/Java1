package Java1.Sem6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Sem6_2 {
        /*
    1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
    2. Создайте метод, в который передайте заполненный выше массив
    и с помощью Set вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
    Для вычисления процента используйте формулу:
    процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
     */
    public static void main(String[] args) {
        Integer[] arr = createArray(1000, 0, 24);
        System.out.println(Arrays.toString(arr));
        System.out.println("Процент уникальности: " + getUnicPercent(arr));
    }

    static double getUnicPercent(Integer[] arr){
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        System.out.println(set);
        double result = set.size() * 100.0 / arr.length;
        return result;
    }

    static Integer[] createArray(int capacity, int min, int max){
        Integer[] arr = new Integer[capacity];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(max - min + 1) + min;
        }
        return arr;
    }
}
