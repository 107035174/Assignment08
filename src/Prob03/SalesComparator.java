package Prob03;

import java.util.Comparator;

public class SalesComparator implements Comparator<Marketing> {
    public int compare(Marketing o1, Marketing o2) {
        return Double.compare(o2.getSalesAmount(), o1.getSalesAmount());
    }
}
