package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Geleneksel yöntemle liste elemanlarını yazdırma
        List<String> names = new ArrayList<>();
        names.add("Ahmet");
        names.add("Ayşe");
        names.add("Mehmet");
        names.add("Zeynep");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();
        // Method Reference yöntemle liste elemanlarını yazdırma
        List<String> namesNew =  Arrays.asList("Ahmet","Ayşe","Mehmet","Zeynep");
        namesNew.forEach(System.out::println);

    }
}