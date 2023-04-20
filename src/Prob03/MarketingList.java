package Prob03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MarketingList {
    private final List<Marketing> marketList;

    MarketingList() {
        marketList = new ArrayList<>();
    }

    public void add(Marketing e) {
        marketList.add(e);
    }

    public void remove(int index) {
        marketList.remove(index);
    }

    public int size() {
        return marketList.size();
    }

    public void sort(Comparator<Marketing> comp) {
        marketList.sort(comp);
    }

    public List<Marketing> toArrayList() {
        return marketList;
    }

    public boolean removeIf(Predicate<Marketing> condition) {
        return marketList.removeIf(condition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= marketList.size() - 2; i++) {
            sb.append(marketList.get(i)).append(", \n");
        }
        sb.append(marketList.get(size() - 1)).append("]");
        return sb.toString();
    }
}
