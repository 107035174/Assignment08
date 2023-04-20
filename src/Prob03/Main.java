package Prob03;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MarketingList list = new MarketingList();
        list.add(new Marketing("David", "Samsung", 2000));
        list.add(new Marketing("Anna", "Nokia", 1000));
        list.add(new Marketing("Steve", "Iphone", 2200));
        list.add(new Marketing("Bob", "Motorola", 800));
        list.remove(1);
        System.out.println("Size of this list is " + list.size());
        System.out.println(list);
        list.sort(new SalesComparator());
        System.out.println(list);

        listMoreThan1000(list.toArrayList());
        System.out.println(list);
    }


    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        list.removeIf(e -> e.getSalesAmount() <= 1000);
        return list;
    }
}
