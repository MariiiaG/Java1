package Java1.Sem2;

/*
 * Дано чётное число N ( > 0) и символы C1 и C2.
 * Написать метод, который вернёт строку длины N, которая состоит из чередующихся символов С1 и С2, 
 * начиная с С1. Ответ : с1с2с1...с2 (всего N символов)
 */

public class Sem2_1 {
    public static void main(String[] args) {
        char c1 = 'a'; // singular quotation marks are only to be used with chars
        char c2 = 'b';
        int n = 6;
        System.out.println(combine(c1, c2, n));
    }
    static String combine(char c1, char c2, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= n / 2; i ++) {
            stringBuilder.append(c1);
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }
    
}
