package Java1.Lec4;

import java.util.*;

/*
 * Stack представляет собой обработку данных по принципу LIFO. Last in first out
 * Несколько устаревшие функции, которые можно заменить deque
 */

public class Ex04_stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(12);
        stack.push(123);
        System.out.println(stack); // [1, 12, 123]
        System.out.println(stack.pop()); // 123
        System.out.println(stack); // [1, 12]
        System.out.println(stack.pop()); // 12
        System.out.println(stack.pop()); // 1
        System.out.println(stack); // []
    }
}
