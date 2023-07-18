package Java1.Lec3_objArrCollListIter;

import java.util.ArrayList;
import java.util.List;

public class Ex06 {
    //    public static void main(String[] args) {
    //     Character value = null;
    //     List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');
    //     System.out.println(list1); //[S, e, r, g, e, y]
    //    // list1.remove(1); // error. Cannot simply remove items of lists created by List.of
    //     List<Character> list2 = List.copyOf(list1);
        
    // }

    public static void main(String[] args) {
        Character value = null;
        List <Character> list1 = new ArrayList<Character>();
        list1.add('S');
        list1.add('e');
        list1.add('r');
        list1.add('g');
        System.out.println(list1); //[S, e, r, g]
        list1.remove(1);
        System.out.println(list1); //[S, r, g]
    }
}
