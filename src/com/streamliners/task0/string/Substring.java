package com.streamliners.task0.string;

public class Substring {
    public static void main(String[] args) {
        String string = "This is streamliner";
        String str1 = "streamliner";
        String str2 = "Program";

        // using contains()
        boolean result = string.contains(str1);
        if(result)
            System.out.println(str1 + " is present in the string.");

        else
            System.out.println(str1 + " is not present in the string.");


        result = string.contains(str2);
        if(result)
            System.out.println(str2 + " is present in the string.");

        else
            System.out.println(str2 + " is not present in the string.");

    }
}

