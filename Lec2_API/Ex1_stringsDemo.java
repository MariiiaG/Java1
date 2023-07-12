package Java1.Lec2_API;

public class Ex1_stringsDemo {
    public static void main(String[] args) {
        String[] name = { "C", "е", "р", "г", "е", "й" };
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); // сергей ка.
        System.out.println(String.join("", name)); // Cергей
        System.out.println(String.join("", "C", "е", "р", "г", "е", "й")); // Cергей
        System.out.println(String.join(" ", "C", "е", "р", "г", "е", "й")); // C е р г е й
        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й")); // C,е,р,г,е,й
    }
}

/*
 * Если вы компонуете материал - лучше испольщовать StringBuilder
 * Если разбираете уже готовый полученный материал - String
 * Много изменений – String
   Много преобразований – StringBuilder
 */
