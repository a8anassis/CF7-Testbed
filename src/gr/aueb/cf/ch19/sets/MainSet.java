package gr.aueb.cf.ch19.sets;

import java.util.HashSet;
import java.util.Set;

public class MainSet {

    public static void main(String[] args) {
        Set<String> bag = new HashSet<>();

        bag.add("Apple");
        bag.add("Orange");
        bag.add("Apple");       // No duplicates allowed.

        if (bag.contains("Apple")) {
            bag.remove("Apple");
        }

        bag.forEach(System.out::println);
    }
}
