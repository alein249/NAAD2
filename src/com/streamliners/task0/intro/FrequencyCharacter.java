package com.streamliners.task0.intro;

public class FrequencyCharacter {
    public static void main(String[] args) {
        String str = "streamliner is awesome";
        char ch = 't';
        int frequency = 0;
        for (int i = 0;i < str.length();i++){
            if(ch == str.charAt(i)){
                frequency++;
            }
        }
        System.out.println("Frequency of "+ ch +" = "+ frequency);

    }
}
