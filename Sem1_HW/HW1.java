// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package Java1.Sem1_HW;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n : ");
        int number = iScanner.nextInt();
        int tri = 0;
        for(int i = 1; i <= number; i ++) {
           tri += i;
        }
        System.out.println("Треугольное число для "+number+" будет "+tri);
    }
}
