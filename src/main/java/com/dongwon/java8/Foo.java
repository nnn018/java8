package com.dongwon.java8;

import java.util.Arrays;

public class Foo {
    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.run();

    }

    private void run() {
        String[] names = {"ddd", "bbb", "ccc", "fff", "hihi"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
