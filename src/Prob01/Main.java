package Prob01;

public class Main {
    public static void main(String[] args) {
        MyPersonList list = new MyPersonList();
        list.add(new Person("Smith", "David", 35));
        list.add(new Person("Jane", "Mary", 27));
        list.insert(new Person("Parker", "Peter", 29), 1);
        System.out.println("Size of this list is " + list.size());
        System.out.println(list);
        list.find("Jane");
        list.remove(2);
        list.remove("Parker");
        System.out.println("Size of this list is " + list.size());
        System.out.println(list);
    }
}