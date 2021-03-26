package com.streamliners.task0.decisionMakingLoops;

public class CharacterAlphabet {
    public static void main(String[] args) {
        char c = 'g';

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    }
}

