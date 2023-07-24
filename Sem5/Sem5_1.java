package Java1.Sem5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 *      Reminder :
 *      Map map1 = new HashMap(); // is an unsorted collection
        Map map2 = new TreeMap(); // ordered collection, sort by key
        Map map3 = new LinkedHashMap(); // in order of new elements getting added 


        Задача :
        Создать сируктуру для хранения Номеров паспортов и Фамилий сотрудников организации.
        123456 Иванов
        321456 Васильев
        234561 Петрова
        234432 Иванов
        654321 Петрова
        345678 Иванов
        Вывести данные по сотрудникам с фамилией Иванов 
 */
public class Sem5_1 {
    public static void main(String[] args) {
        Passports passports = new Passports();
        passports.addNote("123456", "Иванов");
        passports.addNote("321456", "Васильев");
        passports.addNote("234561", "Петрова");
        passports.addNote("234432", "Иванов");
        passports.addNote("654321", "Петрова");
        passports.addNote("345678", "Иванов");

        System.out.println(passports.findByName("Иванов"));
    }
}
