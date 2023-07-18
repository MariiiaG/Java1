package Java1.Lec3_objArrCollListIter;

/*
 * Тип данных Object – «всему голова»
Упаковка – любой тип можно положить в переменную типа Object
Распаковка – преобразование Object-переменной в нужный тип
Иерархия типов – любой тип «ниже» Object’а
 */

public class Mine_object {
    // public static void main(String[] args) {
    //     Object o = 1; GetType(o); // java.lang.Integer
    //     o = 1.2; GetType(o); // java.lang.Double
    // }

    // static void GetType(Object obj) { // using object allows us to use the same method for different data types
    //     System.out.println(obj.getClass().getName());
    // }

    public static void main(String[] args) {
        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.0, 2));
        System.out.println(Sum(1, 2.0));
        System.out.println(Sum(1.2, 2.1));
    }
    static Object Sum (Object a, Object b) { // this way we don't need different methods for diff data types
        if (a instanceof Double && b instanceof Double) {
            return (Object)((Double) a + (Double) b);
        } else if (a instanceof Integer && b instanceof Integer) {
            return (Object)((Integer) a + (Integer) b);
        } else return 0;
    } // not advisable to use if we are unlikely to have different data types as it slows down the process
    // Потеря производительности, чем больше преобразований из и в Объект
    // прибегать к этому механизму в крайнем случае
}
