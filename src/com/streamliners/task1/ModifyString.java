package com.streamliners.task1;

import java.util.Scanner;

public class ModifyString {
    public static void main(String[] args) {
        //taking string as input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string =");
        String str = sc.nextLine();
        //taking replacement string as input
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the replacement string =");
        String rep = sc2.nextLine();
//        System.out.println(modify(str, rep));
        String regex = "([0-9][A-Z])*$";
        if (rep.matches(regex) && (checkModify(str, rep))) {
            System.out.println("The modified string is: " + modify(str, rep));
        } else {
            try {
                throw new InvalidReplacementException();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static String modify(String s, String rep) {
        for (int i = 0; i < rep.length(); i = i + 2) {
            s = s.replace(rep.charAt(i), rep.charAt(i + 1));
        }
        return s;
    }

    public static  boolean checkModify(String s, String rep){

        for(int i = 0; i < s.length(); i++){
            if(!rep.contains(s.charAt(i) + "")){
                return false;
            }
        }
        return true;
    }

}





