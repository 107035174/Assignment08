package Prob03;

import java.util.Comparator;

public class NameComparator implements Comparator<Marketing> {

    @Override
    public int compare(Marketing o1, Marketing o2) {
        if (o1.getSalesAmount() < 1000) return 1;
        return o1.getEmployeeName().compareTo(o2.getEmployeeName());
    }
}
