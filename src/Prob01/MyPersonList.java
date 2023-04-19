package Prob01;

import java.util.Arrays;

public class MyPersonList {
    private final int INITIAL_LENGTH = 4;
    private Person[] personArr;
    private int size;

    public MyPersonList() {
        personArr = new Person[INITIAL_LENGTH];
        size = 0;
    }

    public void add(Person p) {
        if (p == null) return;
        if (size == personArr.length) resize();
        personArr[size++] = p;
    }

    public Person get(int i) {
        if (i < 0 || i >= size) throw new IndexOutOfBoundsException("Out of Bounds");
        return personArr[i];
    }

    public int find(String p) {
        if (p == null) {
            System.out.println(p + " is null");
            return -1;
        }
        for (int i = 0; i < size; i++) {
            if (p.equals(personArr[i].getLast())) {
                System.out.println(p + " is found in position " + i);
                return i;
            }
        }
        System.out.println(p + " is not found in the list");
        return -1;
    }

    public void insert(Person p, int pos) {
        if (pos > size || pos < 0) return;
        if (pos == personArr.length || size + 1 > personArr.length) {
            resize();
        }
        Person[] temp = new Person[personArr.length + 1];
        System.arraycopy(personArr, 0, temp, 0, pos);
        temp[pos] = p;
        System.arraycopy(personArr, pos, temp, pos + 1, personArr.length - pos);
        personArr = temp;
        ++size;
    }

    public void remove(int pos) {
        if (isEmpty()) return;
        if (pos < 0 || pos >= size)
            return;
        Person toBeRemoved = personArr[pos];
        Person[] temp = new Person[personArr.length];
        System.arraycopy(personArr, 0, temp, 0, pos);
        System.arraycopy(personArr, pos + 1, temp, pos, personArr.length - pos - 1);
        personArr = temp;
        --size;
        System.out.println("Removed: " + toBeRemoved.getLast());
    }

    public void remove(String p) {
        if (isEmpty()) return;
        int i = find(p);
        if (i != -1) {
            remove(i);
        }
    }


    public void resize() {
        System.out.println("resizing");
        int len = personArr.length;
        int newlen = 2 * len;
        Person[] temp = new Person[newlen];
        System.arraycopy(personArr, 0, temp, 0, len);
        personArr = temp;
    }

    public int size() {
        return size;
    }

    public Object clone() {
        return Arrays.copyOf(personArr, size);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(personArr[i]).append(", \n");
        }
        sb.append(personArr[size - 1]).append("]");
        return sb.toString();
    }
}
