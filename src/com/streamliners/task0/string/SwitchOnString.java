package com.streamliners.task0.string;

import java.util.Scanner;

public class SwitchOnString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = sc.nextLine();
        switch(string){
            case "streamliner":
                System.out.println(string + " is best");
                break;
            case "jecrc":
                System.out.println(string + " is not good");
                break;
            case "iit":
                System.out.println(string + " is average");
                break;
            default:
                System.out.println(string + " not found");
                break;
        }
    }
}
