package Java1.Sem2;

/*
 * Напишите метод, который сжимает строку.
 * Пример : aaaabbbcdd
 * Результат : a4b3cd2
 */

public class Sem2_2 {
    public static void main(String[] args) {
        String s = "aaaabbbcdd";
        System.out.println(squeeze(s));
    }
    static String squeeze(String line) {
        int count = 1;
        char[] chars = line.toCharArray(); // split string into a char array
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < chars.length; i ++) {
            if (chars[i] == chars[i-1]) {
                count ++;
            } else {
                stringBuilder.append(chars[i-1]);
                if (count != 1) {
                    stringBuilder.append(count);
                    count = 1;
                }
            }
        }
        stringBuilder.append(chars[chars.length - 1]); //  to include the last letter (d2)
        if (count != 1) {
            stringBuilder.append(count);
        }
        return stringBuilder.toString();
    }
}
