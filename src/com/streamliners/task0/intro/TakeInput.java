package com.streamliners.task0.intro;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number=");
        int userinput = scanner.nextInt();
        System.out.println("Entered number is = "+userinput);
    }
}
