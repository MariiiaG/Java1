package Java1.Lec4;

/*
 * Deque
 * Линейная коллекция, которая поддерживает вставку и удаление элементов на обоих концах.
 */

import java.util.*;

public class Ex03_deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1); deque.addLast(2);
        deque.add(34); 
        System.out.println(deque); // [1, 2, 34]
        deque.removeFirst(); deque.removeLast(); 
        System.out.println(deque); // [2]
        deque.offerFirst(1); deque.offerLast(15); // offer, poll, peek, element explained in Ex02_queue notes
        System.out.println(deque); // [1, 2, 15]
        int item = deque.pollFirst(); deque.pollLast(); 
        System.out.println(item); // 1
        System.out.println(deque); // [2]
        deque.offerFirst(87); deque.offerLast(56);
        deque.getFirst(); deque.getLast();
        System.out.println(deque); // [87, 2, 56]
        deque.peekFirst(); deque.peekLast();
        System.out.println(deque); // [87, 2, 56]
    }
}
