package Java1.Lec3_objArrCollListIter;

import java.util.*;

/* 
 * Интерфейс Iterator<E>. Итератор коллекцией. 
 * Iterator занимает место Enumeration в Java Collections Framework. 
 * Итераторы отличаются от перечислений двумя способами:
Итераторы позволяют вызывающей стороне удалять элементы из базовой коллекции во время итерации 
с четко определенной семантикой.

hasNext(), next(), remove()

ListIterator<E> 
hasPrevious(), E previous(), nextIndex(), previousIndex(), set(E e), add(E e)
 */

public class Ex07_iterator {
        public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (int item : list) { // = for each. Data type int, name of the variable to use, name of the collection
            System.out.println(item);
        }

        Iterator<Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()) { 
            //col.remove(); // wont't allow to remove anything --> error
            System.out.println(col.next());
            //col.next(); // unneccessary as it is already stated above in (col.next())
        }
    }
}
