package Java1.Lec3_objArrCollListIter;

public class Lec3_arrays {
    // public static void main(String[] args) {
    //     int[] a = new int[] {1, 9}; // given an array with only 2 items inside
    //     int[] b = new int[3]; // we need to add another item -> create a new  array
    //     System.arraycopy(a, 0, b, 0, a.length); // from a into b, starting with index 0, throughout

    //     for (int i : a) {System.out.printf("%d", i);} // 1 9
    //     for (int j : b) {System.out.printf("%d", j);} // 000
    // }
        static int [] AddItem(int [] array, int item) {
            int length = array.length;
            int[] temp = new int[length + 1];
            System.arraycopy(array, 0, temp, 0, length);
            temp[length] = item;
            return temp;
        }
        public static void main(String[] args) {
            int [] a = new int [] {0, 9};
            for (int i : a) {System.out.printf("%d", i);}
            a = AddItem(a, 2);
            a = AddItem(a, 3);
            for (int j : a) {System.out.printf("%d", j);}
    }
}
