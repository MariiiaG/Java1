package Java1.Sem3;

import java.util.ArrayList;
import java.util.List;

/*
 * Каталог товаров книжного магазина сохранен  в виде двумерного списка List<ArrayList<String>> так, что
 * на 0-й позиции каждого внутреннего списка слдержится название жанра, а на остальных позициях - названия книг
 * Напишите метод для заполнения данной структуры
 * 
 * [
 * [сказки, Золотой Петущок, Колобок, Курочка Ряба]
 * [фантастика, Гарри Поттер, Ночной Дозор]
 * [роман, Война и Мир, Анна Каренина]
 * ]
 * 
 */

public class Sem3_4_2dArray {

    static List<List<String>> bookStore = new ArrayList<>(); // static variable bookStore
    public static void main(String[] args) {
        addBook("сказки", "колобок");
        addBook("фантастика", "Гарри Поттер");
        addBook("фантастика", "гарри поттер");
        addBook("сказки", "курочка ряба");
        addBook("роман", "ромео и джульетта");
        addBook("Роман", "война и мир");
        addBook("фантастика", "ночной дозор");
        addBook("сказки", "золотой гребешок");

        System.out.println(bookStore); 
        // [[сказки, колобок, курочка ряба, золотой гребешок], 
        // [фантастика, Гарри Поттер, гарри поттер, ночной дозор], 
        // [роман, ромео и джульетта, война и мир]]
    }

    static void addBook (String genreBook, String nameBook) {
        for (int i = 0; i < bookStore.size(); i++) {
            List<String> genreList = bookStore.get(i);
            String genre = genreList.get(0);
            if (genreBook.equalsIgnoreCase(genre)) {
                if (!genreList.contains(nameBook)) {
                    genreList.add(nameBook);
                    } 
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(genreBook);
        list.add(nameBook);
        bookStore.add(list);
    }
}
