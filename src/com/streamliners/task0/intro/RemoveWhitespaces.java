package com.streamliners.task0.intro;

public class RemoveWhitespaces {
    public static void main(String[] args) {
            String sentence = "Pan   kaj  i  sbest";
            System.out.println("Original sentence: " + sentence);

            sentence = sentence.replaceAll("\\s", "");
            System.out.println("After replacement: " + sentence);
        }
    }


