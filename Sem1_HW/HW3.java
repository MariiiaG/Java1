// 3) Реализовать простой калькулятор

package Java1.Sem1_HW;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        int num1, num2;
        String op;
        Scanner numbers = new Scanner(System.in);
        System.out.printf("Введите первое число : ");
        num1 = numbers.nextInt();
        System.out.printf("Введите второе число : ");
        num2 = numbers.nextInt();
        Scanner operation = new Scanner(System.in);
        System.out.printf("Введите операцию (+ - * /) : ");
        op = operation.next();

        if (op.equals("+")) {
            System.out.printf("%d + %d = " + (num1 + num2), num1, num2);
        }
        if (op.equals("-")) {
            System.out.printf("%d - %d = " + (num1 - num2), num1, num2);
        }
        if (op.equals("*")) {
            System.out.printf("%d * %d = " + (num1 * num2), num1, num2);
        }
        if (op.equals("/")) {
            System.out.printf("%d / %d = " + (num1 / num2), num1, num2);
        }
    }
}
