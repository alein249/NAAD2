package com.streamliners.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubTask1 {
    public static List<Integer> getList(String s){

        // splitting the string at ";"
        String[] str = s.split(";");
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<str.length;i++){
            list.add(Integer.parseInt(str[i]));
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String result = sc.nextLine();
        List<Integer> list = getList(result);
        System.out.println("The resulting list is: " + list);
    }

}
