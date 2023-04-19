package Prob03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Marketing> list = new ArrayList<Marketing>();
        list.add(new Marketing("David", "Samsung", 2000));
        list.add(new Marketing("Anna", "Nokia", 1000));
        list.add(new Marketing("Steve", "Iphone", 2200));
        list.add(new Marketing("Bob", "Motorola", 800));
        list.remove(1);
        System.out.println("Size of this list is " + list.size());
        for (Marketing e : list) {
            System.out.println(e);
        }
        list.sort(new SalesComparator());
        for (Marketing e : list) {
            System.out.println(e);
        }
        list.sort(new NameComparator());
        for (Marketing e : list) {
            System.out.println(e);
        }
        listMoreThan1000(list);
        list.sort(new NameComparator());
        for (Marketing e : list) {
            System.out.println(e);
        }
    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        list.removeIf(e -> e.getSalesAmount() >= 1000);
        return list;
    }
}
