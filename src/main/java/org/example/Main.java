package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Ahmet");
        names.add("Ayşe");
        names.add("Mehmet");
        names.add("Zeynep");

        // Geleneksel yöntemle liste elemanlarını yazdırma
        for (String name : names) {
            System.out.println(name);
        }

        // Method Reference yöntemle liste elemanlarını yazdırma
        names.forEach(System.out::println);

    }
}