package Java1.Sem6_HW;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import Java1.Sem6.Cat;

/*
 *Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, 
отвечающие фильтру. Критерии фильтрации можно хранить в Map. 
Например: 
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - 
сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

Частые ошибки:
1. Заставляете пользователя вводить все существующие критерии фильтрации
2. Невозможно использовать более одного критерия фильтрации одновременно
3. При выборке выводятся ноутбуки, которые удовлетворяют только одному фильтру, 
а не всем введенным пользователем
4. Работа выполнена только для каких-то конкретных ноутбуков, и если поменять характеристики ноутбуков 
или добавить еще ноутбук, то программа начинает работать некорректно
 */

public class Main {
    public static void main(String[] args) {
        Set<Laptop> set = new HashSet<>();

        Laptop lt1 = new Laptop(00, "Acer", 12, "Windows", 95_000, "Silver");
        Laptop lt2 = new Laptop(01, "Asus", 16, "Windows", 100_000, "White");
        Laptop lt3 = new Laptop(02, "Apple", 8, "MacOS", 150_000, "Pink");
        Laptop lt4 = new Laptop(03, "Razer", 16, "Windows", 200_000, "Black");
        Laptop lt5 = new Laptop(04, "Dell", 24, "Windows", 203_000, "Silver");
        Laptop lt6 = new Laptop(05, "Asus", 12, "Windows", 110_000, "White");

        set.add(lt1);
        set.add(lt2);
        set.add(lt3);
        set.add(lt4);
        set.add(lt5);
        set.add(lt6);
        
        // for (Laptop laptop: set){
        //    System.out.println(laptop);
        // }
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select : ");
        System.out.println("1 - to sort by Brand");
        System.out.println("2 - to sort by RAM");
        System.out.println("3 - to sort by price");
        System.out.println("4 - to sort by colour");

    
            int selection = scanner.nextInt();

            if (selection == 1) { // sort by Brand
                System.out.printf("What brand are you looking for ? ");
                String brand = scanner.nextLine();
                if (brand.equalsIgnoreCase("Acer")) {
                    System.out.println(lt1.toString());
                } if (brand.equalsIgnoreCase("Asus")) {
                    System.out.println(lt2.toString() + "\n" + lt6.toString());
                } if (brand.equalsIgnoreCase("Apple")) {
                    System.out.println(lt3.toString());
                } if (brand.equalsIgnoreCase("Razer")) {
                    System.out.println(lt4.toString());
                } if (brand.equalsIgnoreCase("Dell")) {
                    System.out.println(lt5.toString());
                } else 
                    System.out.println("Sorry, brand not found");

            } else if (selection == 2) { //sort by RAM
                System.out.printf("What size of RAM do you need (8 / 12 / 16 / 24) ? ");
                int ram = scanner.nextInt();
                if (ram == 8) {
                    System.out.println(lt3.toString());
                } else if (ram == 12) {
                    System.out.println(lt1.toString() + "\n" + lt6.toString());
                } else if (ram == 16) {
                    System.out.println(lt2.toString() + "\n" + lt4.toString());
                } else if (ram == 24) {
                    System.out.println(lt5.toString());
                } else 
                System.out.println("No such laptop");

            } else if (selection == 3) { //sort by Price
                System.out.printf("What is your price range (1 - below 100_000; 2 - 100_000 - 149_999; 3 - 150_000 and above) ? ");
                int price = scanner.nextInt();
                if (price == 1) {
                    System.out.println(lt1.toString());
                } else if (price == 2) {
                    System.out.println(lt2.toString() + "\n" + lt6.toString());
                } else if (price == 3) {
                    System.out.println(lt3.toString() + "\n" + lt4.toString() + "\n" + lt5.toString());
                } else 
                System.out.println("Invalid entry");

            } else if (selection == 4) { //sort by Colour
                System.out.printf("Which colour do you prefer (1 - Silver, 2 - White, 3 - Pink, 4 - Black) ? ");
                int colour = scanner.nextInt();
                if (colour == 1) {
                    System.out.println(lt1.toString());
                } else if (colour == 2) {
                    System.out.println(lt2.toString() + "\n" + lt6.toString());
                } else if (colour == 3) {
                    System.out.println(lt3.toString() + "\n" + lt4.toString() + "\n" + lt5.toString());
                } else if (colour == 4) {
                    System.out.println(lt3.toString() + "\n" + lt4.toString() + "\n" + lt5.toString());
                } else 
                System.out.println("Invalid entry");
            }
    }
}
