package Java1.Sem4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * 1) Написать метод, который принимает массив элементов, 
 * помещает их в стэк и выводит на консоль сожержимое стэка
 * 2) Написать метод, который принимает массив элементов, 
 * помещает их в очередь и выводит на консоль сожержимое очереди
 */

public class Sem4_4_stackQueue {
    public static void main(String[] args) {
        testQueue();
        testStack();
    }

    static void testQueue() {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");

        System.out.println(queue); // [1, 2, 3, 4]

        // while (!queue.isEmpty()) {
        //     System.out.println(queue.poll()); // 1  2  3  4
        // }

        for (String string : queue) {
            System.out.println(string); // 1  2  3  4
        }
    }

    static void testStack() {
        Stack<String> stack = new Stack<>();
        stack.push("1"); 
        stack.push("2");
        stack.push("3");
        stack.push("4");

        System.out.println(stack); // [1, 2, 3, 4]
        
        // while (!stack.isEmpty()) {
        //     System.out.println(stack.pop()); // 4  3  2  1
        // }

        for (String string : stack) {
            System.out.println(string); // 1  2  3  4
        }
    }
}
