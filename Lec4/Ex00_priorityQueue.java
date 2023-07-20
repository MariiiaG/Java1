package Java1.Lec4;

/*
 * Наивысший приоритет имеет «наименьший» элемент. Easy when we're working with numbers, but what if we have 
 * abstract data ?
 */

import java.util.PriorityQueue;

public class Ex00_priorityQueue {
      public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(1);
        System.out.println(pq); // [1, 3, 13, 123]
        System.out.println(pq.poll()); // 1  (poll explained in Ex02_queue)
        System.out.println(pq.poll()); // 3
        System.out.println(pq); // [13, 123]
        System.out.println(pq.poll()); // 13
        System.out.println(pq.poll()); // 123
        System.out.println(pq.poll()); // null
    }
}
