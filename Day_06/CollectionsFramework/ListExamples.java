package com.example.day06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {

        System.out.println("=== ArrayList Example ===");
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Apple"); // duplicate allowed

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i + ": " + arrayList.get(i));
        }

        System.out.println("\n=== LinkedList Example ===");
        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        linkedList.remove(0);

        for (Integer val : linkedList) {
            System.out.println(val);
        }

        System.out.println("\nNotes:");
        System.out.println("- ArrayList: fast random access, slower middle insert/remove");
        System.out.println("- LinkedList: fast insert/remove when you have the reference");
    }
}
