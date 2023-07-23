package Java1.Sem4;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * 1) Замерьте время, за которое в ArrayList добавится 10_000 элементов
 * 2) Змерьте время, за которое в LinkedList добавятся 10_000 элементов. 
 * Сравните с предыдущим
 */

public class Sem4_1_arrayLAndLinkedL {
    public static void main(String[] args) {
        ArrayList listArr = new ArrayList<>();
        LinkedList listLink = new LinkedList<>();

        long timeStart = System.currentTimeMillis(); // counts milliseconds it took to complete the task
        for (int i = 0; i < 1_000_00; i++) {
            //list1.add(i); // 177 to add 1_000_000 els
            listArr.add(0, i); // 595  see how long it takes to add a new el in the very beginning
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart); 

        long timeStart1 = System.currentTimeMillis(); 
        for (int i = 0; i < 1_000_00; i++) {
            //list2.add(i); // 212 to add 1_000_000 els
            listLink.add(0, i); // 49
        }
        long timeFinish1 = System.currentTimeMillis();
        System.out.println(timeFinish1 - timeStart1); 
    }
}

// if it comes to using huge amounts of data then ArrayList is more efficient time- and resources-wise
// LinkedList wins when it comes to adding elements in the beginning / middle of the list
// ArrayList if we mostly access the data or add elements to the end