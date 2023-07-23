package Java1.Sem4;

/**
 * MyStack
 */
public class MyStack {
    String [] arr = new String[10];
    int size; // for primitive data types there's no need to type int size = 0; it equals to 0 by default

    int size() {
        return size;
    }
    boolean empty(){
        return size == 0;  // returns true if size = 0
    }
    void push(String item) {
        if (size >= arr.length) {
            String[] arr2 = new String[arr.length * 2]; // swap for a bigger array if the original one is full
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2;
        }
        arr[size++] = item; // first item will be saved with ind 0 and then size ++. Size = index here
    } 
    String peek() {
        if (empty()) {
            return null;
        }
        return arr[size - 1];
    }
    String pop() {
        if (empty()) {
            return null;
        }
        return arr[--size];
    }
}