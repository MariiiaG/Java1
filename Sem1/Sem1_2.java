package Java1.Sem1;

import java.util.Arrays;
import java.util.Random;

public class Sem1_2 {

    /*
     * Дан массив двоичных чисел, например [1, 1, 0, 1, 1, 1],
     * Вывести максимпальное количество подряд идущих 1
     */
    
    public static void main(String[] args) {
        int[] arr = random(10, 0, 2); // to create a random array of 0 and 1
    System.out.println(Arrays.toString(arr));
    System.out.println(count(arr));
    }

    static int[] random (int capacity, int min, int max){
        int[] array = new int[capacity];
        Random random = new Random(); //don't need this line if i use the commented line below instead
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(min, max); //array[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return array;
    }

    static int count(int[] arr){
        int maxCount = 0;
        int countOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                countOnes += 1;
                if (maxCount < countOnes) {
                    maxCount = countOnes;
                }
            }
            else {
                countOnes = 0;
            } 
        }
        return maxCount;
    }
}
