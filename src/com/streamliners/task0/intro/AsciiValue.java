package com.streamliners.task0.intro;

public class AsciiValue {
    public static void main(String[] args) {
        char ch = 'a';
        int ascii = ch;
        //You can also cast char to int
        int castAscii = (int)ch;

        System.out.println("The ASCII Value Of "+ ch +" is = "+ ascii);
        System.out.println("The ASCII Value Of "+ ch +" is = "+ castAscii);
    }
}
