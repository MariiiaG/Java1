package Java1.Sem4;

/*
 * Реализовать стэк с помощью массива.
 * Нужно реализовать методы :
 * size(), empty(), push(), peek(), pop()
 */

public class Sem4_5_classStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("1");
        stack.push("2");
        System.out.println(stack.size);
        stack.push("3");
        stack.push("4");
        System.out.println(stack.size);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size);
    }
}
