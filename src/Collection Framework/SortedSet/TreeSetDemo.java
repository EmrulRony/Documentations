package CollectionFramework.SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        SortedSet sortedSet = new TreeSet();
        sortedSet.add("A");
        sortedSet.add("X");
        sortedSet.add("B");
        sortedSet.add("1");

        System.out.println(sortedSet);
    }
}