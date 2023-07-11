package Java1.Sem1;

import java.time.LocalTime;
import java.util.Scanner;

public class Sem1_1 {

    /* В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида :
     *  "Доброе утро, "имя!"", если время от 05:00 до 11.59
     *  "Добрый день, "имя!"", если время от 12:00 до 17.59
     *  "Добрый вечер, "имя!"", если время от 18:00 до 22.59
     *  "Доброй ночи, "имя!"", если время от 23:00 до 04.59
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        LocalTime time = LocalTime.now(); // текущее время
        System.out.println("Как вас зовут ? ");
        String name = scanner.nextLine(); // считает строку полностью, в отл от scanner.Next - только первое слово
        
        // LocalTime time1 = LocalTime.of(11, 52); // задать каонкретное время для сравнения
        // if (time.isBefore(time1)) {
        //     System.out.println("Good Morning!");
        // }
        
        int hour = time.getHour();
        if (hour >= 5 && hour < 12){
            System.out.println("Дoброе утро, " + name + "!");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Дoбрый день, " + name + "!");
        } else if (hour >= 18 && hour < 23) {
            System.out.println("Дoбрый вечер, " + name + "!");
        } else {
            System.out.println("Дoброй ночи, " + name + "!");
        }
        scanner.close();
    }
}
