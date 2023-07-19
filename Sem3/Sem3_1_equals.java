package Java1.Sem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Даны следующие строки, сравнить их с помощью == и метода equals() класса Object
 * String s1 = "hello";
 * String s2 = "hello";
 * String s3 = s1;
 * String s4 = "h" + "e" + "l" + "l" + "o";
 * String s5 = new String("hello");
 * String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
 */

public class Sem3_1_equals {
    // public static void main(String[] args) {
    //     String s1 = "hello";
    //     String s2 = "hello";
    //     String s3 = s1;
    //     String s4 = "h" + "e" + "l" + "l" + "o";
    //     String s5 = new String("hello"); 
    //     String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

    //     System.out.println(s1 == s2); // true
    //     System.out.println(s1 == s3); // true
    //     System.out.println(s1 == s4); // true
    //     System.out.println(s1 == s5); // false
    //     System.out.println(s1 == s6); // false
    //     System.out.println();
    //     System.out.println(s1.equals(s2)); // true
    //     System.out.println(s1.equals(s3)); // true
    //     System.out.println(s1.equals(s4)); // true
    //     System.out.println(s1.equals(s5)); // true
    //     System.out.println(s1.equals(s6)); // true
    // }
/*
== это сравнение ссылок. Ссылочный тип данных. Т.к такая же строка уже существует в heap
и строки - неизменияемый тип, то нет смысла создавать новую строку с таким же содержимым -->  ссылка одинкова
String s5 = new String("hello"); устаревший способ создания. Каждый раз создает новую строку с новой ссылкой
better not to use 'new String' to create strings
*/
/*
Метод equals() сравнивает уже не ссылки, а содержимое строки.
Hence, for the purposes of comparing the contents of the string, we should rather use the 'equals' method.
Equals cannot be used with primitive data types 
Primitive data types - includes byte, short, int, long, float, double, boolean and char
Non-primitive data types (ссылочные типы данных)- such as String, Arrays and Classes
 */

    public static void main(String[] args) {
        int a = 5;
        List<Integer> list = new ArrayList<>();
        int[] arr = {1, 2, 3};
        test(a, list, arr);
        System.out.println(a); // 5
        System.out.println(list); // [5]
        System.out.println(Arrays.toString(arr)); // [5, 2, 3]

        String s = "4";
        System.out.println(s.equals('4')); // false - different data types

        Integer c = 4;
        Float f = 4f;
        System.out.println(c.equals(f)); // false. It compares data types first and those are diff here
    }

    static void test(int a, List<Integer> list, int[] arr) {
        a ++;
        System.out.println("внутри метода : " + a); // внутри метода : 6 Примитивный, не ссылочный тип
        list.add(5);  // Ссылочный тип. Изменения отражаются вне метода
        arr[0] = 5;
    }
}