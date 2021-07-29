package com.dongwon.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class App {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("keesun");
        name.add("white");
        name.add("xxx");
        name.add("foo");
        Spliterator<String> spliterator = name.spliterator();
        Spliterator<String> stringSpliterator = spliterator.trySplit();
        while (spliterator.tryAdvance(System.out::println));
        System.out.println("=======================");
        while (stringSpliterator.tryAdvance(System.out::println));


        //name.forEach(System.out::println);
    }
}
