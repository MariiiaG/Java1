package Java1.Sem1;

public class Sem1_3 {
    /*
     * Во фразе "Добро пожаловать на курс по Java"  переставить слова а обратном порядке
     */
    public static void main(String[] args) {
        String line = "Добро пожаловать на курс по Java";
        System.out.println(reverse(line));
    }

    static String reverse(String line){
        String[] temp = line.split(" ");
        String res = "";
        for (int i = temp.length - 1; i >= 0; i--) {
            res += temp[i] + " ";
        }
        return res;
    }
}
