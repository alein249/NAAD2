package com.streamliners.task0.string;

public class EqualString {
    public static void main(String[] args) {
        String name1 = new String("Streamliner");
        String name2 = new String("Streamliner");

        System.out.println("Check if two strings are equal");

        // check if two strings are equal
        // using == operator
        boolean result1 = (name1 == name2);
        System.out.println("Using == operator: " + result1);

        // using equals() method
        boolean result2 = name1.equals(name2);
        System.out.println("Using equals(): " + result2);
    }
}

