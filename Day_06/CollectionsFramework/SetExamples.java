package com.example.day06;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {

        System.out.println("=== HashSet (NO order) ===");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple"); // duplicate ignored

        for (String s : hashSet) {
            System.out.println(s);
        }

        System.out.println("\n=== LinkedHashSet (Insertion Order) ===");
        Set<String> linked = new LinkedHashSet<>();
        linked.add("Apple");
        linked.add("Banana");
        linked.add("Cherry");

        for (String s : linked) {
            System.out.println(s);
        }

        System.out.println("\n=== TreeSet (Sorted Order) ===");
        Set<String> tree = new TreeSet<>();
        tree.add("Banana");
        tree.add("Apple");
        tree.add("Cherry");

        for (String s : tree) {
            System.out.println(s);
        }

        System.out.println("\nNotes:");
        System.out.println("- Set: no duplicates");
        System.out.println("- HashSet: fastest but unordered");
        System.out.println("- LinkedHashSet: keeps insertion order");
        System.out.println("- TreeSet: sorts elements");
    }
}
