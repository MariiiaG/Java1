package Java1.Sem3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Создать список типа ArrayList. Поместить в него как строки, так и целые числа.
 * Пройти по списку, найти и удалить целые числа.
 */

public class Sem3_3_removeInt_iterator {
    public static void main(String[] args) {
        List list = new ArrayList(); // if there's no <> with data type in List<> list, then it implies Object
        list.add(4);
        list.add("10");
        list.add("asasd");
        list.add(7);
        list.add(8);
        list.add(4.5);
        list.add(null);

        //removeInteger(list);
        removeIntegerV2(list);
        System.out.println(list); // [10, asasd, 4.5, null]
    }

    static void removeInteger(List list) {
        for (int i = 0; i < list.size(); i++) { // (int i = list.size()-1; i >= 0; i --) to go through the list in reverse. 
            if (list.get(i) instanceof Integer) {  // ^ In this case we won't need to do i-- in the end of the method
                list.remove(i);
                i --; // in case there's muyltiple ints in a row. 
            } // If we delete one, then the next one takes its index and will be skipped in our fori loop
        }
    }

    static void removeIntegerV2(List list) {
        Iterator iterator = list.iterator(); // iterator is used to go through all items in thr collection
        while (iterator.hasNext()) {
            Object object = iterator.next();
            if (object instanceof Integer) {
                iterator.remove(); // removes the current element of the collection
            } // in this case we don't need to do i-- as in the method above ^
        } // use Iterator when we need to go through all items without changing them. But ok to remove
    } // we don't use indexes with iterator. For indexes use fori
}