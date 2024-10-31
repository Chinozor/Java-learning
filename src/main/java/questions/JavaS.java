package questions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Всё компилится, запускается и отрабатывает без ошибок
 * <p>
 * ЧТО ВЫВЕДЕТ?
 * <p>
 * System.out.println(list1);
 * System.out.println(list2);
 */

public class JavaS {
    static class A {
        public int a;

        public A(int a) {
            this.a = a;
        }

        @Override
        public String toString() {
            return String.valueOf(a);
        }
    }

    public static void main(String[] args) {

        List<A> list1 = Arrays.asList(new A(1), new A(2));
        List<A> list2 = new ArrayList<>();
        for (A item : list1) {
            if (1 == item.a) {
                list2.add(item);
            }
        }
        list2.get(0).a = 4;
        System.out.println(list1);
        System.out.println(list2);
    }
}