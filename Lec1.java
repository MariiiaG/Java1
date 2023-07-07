package Java1;

import java.security.spec.PSSParameterSpec;
import java.util.Scanner;

public class Lec1 {
// data types in Java :

    // public static void main(String[] args) {
    //     System.out.println("Hello again");
    // }
    // public static void main(String[] args) {
    //     short age = 10; // int. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
    //     int salary = 123456;
    //     System.out.println(age);
    //     System.out.println(salary);
    // }
    // public static void main(String[] args) {
    //     float e = 2.7f; // have to put an f at the end to mark it as float
    //     double pi = 3.1215;
    //     System.out.println(e);
    //     System.out.println(pi);
    // }
    // public static void main(String[] args) {
    //     char ch = '1';
    //     System.out.println(Character.isDigit(ch)); // true
    //     ch = 'a';
    //     System.out.println(Character.isDigit(ch)); // false
    // }
    // public static void main(String[] args) {
    //     boolean flag1 = 123 <= 234;
    //     System.out.println(flag1); // true
    //     boolean flag2 = 123 >= 234 || flag1;
    //     System.out.println(flag2); // true
    //     boolean flag3 = flag1 ^ flag2; // ^ will return true when only one of the results is true
    //     System.out.println(flag3); // false 
    // }
    // public static void main(String[] args) {
    //     String msg = "hello World";
    //     System.out.println(msg);
    // // }
    // public static void main(String[] args) {
    //     // неявная типизация
    //     var a = 123; 
    //     System.out.println(a); // 123
    //     var d = 123.345;
    //     System.out.println(d); // 123.345
    //     // System.out.println(getType(a)); // int - error ?
    //     // System.out.println(getType(d)); // double
    //     d = 1022;
    //     System.out.println(d);
    //     // System.out.println(getType(d));
    // }


// Классы-обёртки (integer - примитивный тип данных. Integer - обёртка(позволяет раскрыть доп функции))
    // public static void main(String[] args) {
    //     int i = 23_123_34; // can separate longer numbers with _
    //     System.out.println(Integer.MAX_VALUE); // more options in the drop-down menu after Integer
    // }
    // public static void main(String[] args) {
    //     String s = "qwer";
    //     System.out.println(s.charAt(1)); // w  // allows to use index to get a certain item
    // }


// Операции в Java
    // public static void main(String[] args) {
    //     int a = 123;
    //     // System.out.println(a++); // 123 постфиксный инкремент
    //     // System.out.println(a); // 124

    //     System.out.println(++ a); // 124 префиксный инкремент
    //     System.out.println(a); // 124
    // }


// Одномерные массивы
    // public static void main(String[] args) {
    //     int[] arr = new int[10]; // fills it with zeros be default
    //     System.out.println(arr.length); // 10
    //     System.out.println(arr[3]); // 0
    //     arr[3] = 12;
    //     System.out.println(arr[3]);

    //     arr = new int[] {1, 2, 3, 4, 5};
    //     System.out.println(arr.length); // 5
    // }

// Многомерные массивы
    // public static void main(String[] args) {
    //     int[] arr[] = new int[3][5];
    //     for (int[] line : arr) {
    //         for (int item : line) {
    //             System.out.printf("%d", item);
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) {
    //     int [][] arr = new int[3][5]; // массив массивов

    //     for (int i = 0; i < arr.length; i ++) {
    //         for (int j = 0; j < arr[i].length; j ++) {
    //             System.out.printf("%d", arr[i][j]);
    //         }
    //         System.out.println();
    //     }
    // }



// Преобразования
//         public static void main(String[] args) {
//             int i = 123; double d = i;
//             System.out.println(i);  // 123
//             System.out.println(d);  // 123.0
//             d = 3.1415; i = (int)d;
//             System.out.println(d);  // 3.1415
//             System.out.println(i);  // 3
//             d = 3.9415; i = (int)d;
//             System.out.println(d);  // 3.9415
//             System.out.println(i);  // 3
//             byte b = Byte.parseByte("123");
//             System.out.println(b);  // 123
//             b = Byte.parseByte("1234"); // max value for byte is 255
//             System.out.println(b);  // NumberFormatException: Value out of range
//  }



// Получение данных из терминала
    // public static void main(String[] args) {
    //     Scanner iScanner = new Scanner(System.in); // экземпляр класса сканер
    //     System.out.printf("name: ");
    //     String name = iScanner.nextLine();
    //     System.out.printf("Привет, %s!\n", name); // \n at the end to remove % that VSC inserts at the end of the line in the terminal
    //     iScanner.close();
    // }

// Некоторые примитивы
    // public static void main(String[] args) {
    //     Scanner iScanner = new Scanner(System.in);
    //     System.out.printf("int a: ");
    //     int x = iScanner.nextInt();
    //     System.out.printf("double a: ");
    //     double y = iScanner.nextDouble();
    //     System.out.printf("%d + %f = %f", x, y, x + y);
    //     iScanner.close();
    // }

// Проверка на соответствие получаемого типа
    // public static void main(String[] args) {
    //     Scanner iScanner = new Scanner(System.in);
    //     System.out.printf("int a: ");
    //     boolean flag = iScanner.hasNextInt();
    //     System.out.println(flag);
    //     int i = iScanner.nextInt();
    //     System.out.println(i);
    //     iScanner.close();
    // }



// Форматированный вывод
    // public static void main(String[] args) {
    //     int a = 1, b = 2;
    //     int c = a + b;
    //     String res = a + " + " + b + " = " + c;
    //     System.out.println(res);
    // }

    // public static void main(String[] args) {
    //     int a = 1, b = 2;
    //     int c = a + b;
    //     String res = String.format("%d + %d = %d \n", a, b, c);
    //     System.out.println(res);
    //     //System.out.printf("%d + %d = %d \n", a, b, c);
    // }

// Виды спецификаторов
// %d: целочисленных значений
// %x: для вывода шестнадцатеричных чисел
// %f: для вывода чисел с плавающей точкой
// %e: для вывода чисел в экспоненциальной форме, например, 3.1415e+01
// %c: для вывода одиночного символа %s: для вывода строковых значений

    // public static void main(String[] args) {
    //     float pi = 3.1415f;
    //     System.out.printf("%f\n", pi);    // 3,141500
    //     System.out.printf("%.2f\n", pi);  // 3,14
    //     System.out.printf("%.3f\n", pi);  // 3,141
    //     System.out.printf("%e\n", pi);    // 3,141500e+00
    //     System.out.printf("%.2e\n", pi);  // 3,14e+00
    //     System.out.printf("%.3e\n", pi);  // 3,141e+00
    // }



// Область видимости переменных
    // public static void main(String[] args) {
    //     {
    //         int i = 123;
    //         System.out.println(i);
    //     }
    //     System.out.println(i);  // error: cannot find symbol
    // }

    // public static void main(String[] args) {
    //     {
    //         int a = 222;
    //         System.out.println(a); // 222
    //     }
    //     int a = 123;
    //     System.out.println(a); // 123
    // }



// Функции и методы. Функции и методы — это технически одно и то же. Функции могут не принадлежать классам, 
// а методы принадлежат. В java все функции являются методами.
    // static void sayHi() {
    //     System.out.println("hi!");
    // }
    // static int sum(int a, int b) {
    //     return a+b;
    // }
    // static double factor(int n) {
    //     if(n==1)return 1;
    //     return n * factor(n-1);
    // }
    // public static void main(String[] args) {
    //     sayHi(); // hi!
    //     System.out.println(sum(1, 3)); // 4
    //     System.out.println(factor(5)); // 120.0
    // }



// Управляющие конструкции: условный оператор
    // public static void main(String[] args) {
    //     int a = 1;
    //     int b = 2;
    //     int c;
    //     if (a > b) {
    //         c = a; 
    //     } else {
    //         c = b; 
    //     }
    //     System.out.println(c);
    // }

    // public static void main(String[] args) {
    //     int a = 1;
    //     int b = 2;
    //     int c = 0;
    //     if (a > b) c = a;
    //     if (b > a) c = b;
    //     System.out.println(c);
    // }

// тернарный оператор
        // public static void main(String[] args) {
        //     int a = 1;
        //     int b = 2;
        //     int min = a < b ? a : b; 
        //     System.out.println(min); // 1
        // }



// Оператор выбора Switch  NEED TO LOOK UP. NOT CLEAR
    // public static void main(String[] args) {
    //     int month = value;
    //     String text = "";
    //     switch (month) {
    //         case 1:
    //             text = "Autumn";
    //             break; // each case should close with a break
    //         ...
    //         default:
    //             text = "mistake";
    //             break;
    //     }
    //     System.out.println(text);
    //     iScanner.close();
    // }



// Циклы. В java доступны следующие циклы: цикл while; цикл do while; цикл for; и его модификация for in
    // public static void main(String[] args) {
    //     int value = 321;
    //     int count = 0;
    //     while (value != 0) {
    //         value /= 10;
    //         count++; }
    //     System.out.println(count); // 3
    // }

    // public static void main(String[] args) { // do while цикл с постусловием
    //     int value = 321;
    //     int count = 0;

    //     do {
    //         value /= 10;
    //         count++;
    //     } while (value != 0);
    //     System.out.println(count);     // 3
    // }



// Циклы (continue, break). 
// Выполнение следующей итерации цикла — continue. 
// Прерывание текущей итерации цикла — break.   
    // public static void main(String[] args) {
    //     for (int i = 0; i < 10; i ++) {
    //         if (i % 2 == 0) {
    //             continue; // will skip to the next i if i % 2 == 0 // will result in only odd numbers
    //         }
    //         System.out.println(i); // 1 3 5 7 9
    //     }
    // }

    // public static void main(String[] args) {
    //     for (int i = 1; i < 10; i ++) {
    //         if (i % 2 == 0) {
    //             break; // will stop once it gets to the first odd number 
    //         }
    //         System.out.println(i);
    //     }
    // }

    // public static void main(String[] args) {
    //     int s = 0;
    //     for (int i = 1; i <= 10; i ++) {
    //         s += i;
    //     }
    //     System.out.println(s);
    // }


// Вложенные циклы
    // public static void main(String[] args) {
    //     for (int i = 0; i < 5; i++) {
    //         for (int j = 0; j < 5; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

// for :   Работает только для коллекций
    // public static void main(String[] args) {
    //     int arr[] = new int[10];
    //     for (int item : arr) {
    //         System.out.printf("%d ", item);
    //     }
    //     System.out.println(); // 0 0 0 0 0 0 0 0 0 0 
    // }
}


// + Работа с файлами