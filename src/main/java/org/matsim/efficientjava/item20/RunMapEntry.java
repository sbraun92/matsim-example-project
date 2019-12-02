package org.matsim.efficientjava.item20;

import java.util.Map;

public class RunMapEntry {
    public static void main(String[] args) {
        Map.Entry<Integer,Integer> entry1 = new IntegerMapEntry();
        Map.Entry<Integer,Integer> entry2 = new IntegerMapEntry();

        ((IntegerMapEntry<Integer>) entry1).setKey(1);
        entry1.setValue(12);
        ((IntegerMapEntry<Integer>) entry2).setKey(2);
        entry2.setValue(14);

        System.out.println(entry1.toString());
        System.out.println(entry2.toString());
    }
}
