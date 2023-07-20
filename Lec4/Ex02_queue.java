package Java1.Lec4;

/*
 * Работает пл принрципу "Кто первый пришел - тот первый обработан". First in first out (FIFO).
 * 
 */

import java.util.LinkedList;
import java.util.Queue;

public class Ex02_queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue); // [1, 2, 3, 4]
        int item = queue.remove(); // deletes the element that was added first
        System.out.println(item); // 1
        System.out.println(queue); // [2, 3, 4]
        queue.offer(2809);
        System.out.println(queue); // [2, 3, 4, 2809]
        item = queue.remove();
        queue.add(123);
        System.out.println(queue); // [3, 4, 2809, 123]
        item = queue.remove();
        System.out.println(queue); // [4, 2809, 123]
        item = queue.poll(); // see notes below
        System.out.println(item); // 4
        System.out.println(queue); // [2809, 123]
        System.out.println(queue.peek()); // 2809  (returns the element at the front the container)
        System.out.println(queue.element()); // 2809
    }
}

/*
add() method in Java:
It Inserts the specified element to the end of the queue if there is space, 
returning true upon success and throwing an IllegalStateException if no space is currently available. 
This method returns a boolean value depicting the successfulness of the operation. 
If the element was added, it returns true, else it returns false.

Offer() method in Java:
It Inserts the specified element into this queue if it is possible to do so immediately without 
violating capacity restrictions. When using a capacity-restricted queue, this method is generally preferable to
add(E), which can fail to insert an element only by throwing an exception.
Parameters: This method accepts a mandatory parameter e which is the element to be inserted in the Queue.
Returns: This method returns true on successful insertion else it returns false.

The peek() method of Queue Interface returns the element at the front the container. 
It does not delete the element in the container. This method returns the head of the queue. 
The method does not throw an exception when the Queue is empty, it returns null instead.

The poll() method of Queue Interface returns and removes the element at the front end of the container. 
It deletes the element in the container. The method does not throw an exception when the Queue is empty, 
it returns null instead.

The remove() and poll() methods differ only in their behavior when the queue is empty: 
the remove() method throws an exception, while the poll() method returns null. 
The element() and peek() methods return, but do not remove, the head of the queue.
 */