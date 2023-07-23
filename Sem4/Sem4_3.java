package Java1.Sem4;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/*
 * Принимает от пользователя и запоминает строки.
 * Если введено print, выводит строка так, чтобы последняя введенная была первой в списке, а первая - последней.
 * Если введено revert, удаляет предыдущую введенную строку из памяти
 */

public class Sem4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        boolean work = true;
        while (work) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("print")) {
                // for (int i = list.size() - 1; i >= 0; i --) { // not an efficient solution for a LinkedList
                //     System.out.println(list.get(i)); // better use iterator for LinkedLists
                // }
                ListIterator<String> listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    System.out.println(listIterator.previous());
                }
                System.out.println(list);
            } else if (line.equalsIgnoreCase("revert") && list.size() > 0) {
                list.removeLast();
                System.out.println(list);
            } else {
                list.add(line);
                System.out.println(list);
            }
        }
    }
}
