package com.streamliners.task0.string;

public class IterateString {
    public static void main(String[] args) {
        String name = "Streamliner";

        System.out.println("Characters in " + name + " are:");

        // loop through each element
        for (int i = 0; i < name.length(); i++) {

            // access each character
            char a = name.charAt(i);
            System.out.print(a + ", ");
        }
    }
}
