package com.streamliners.task1;

import java.util.Scanner;

public class DirectlyPropotional {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements for first array =");
        int n1 = sc.nextInt();
        System.out.println("Enter no of elements for second array =");
        int n2 = sc.nextInt();
        //create first array
        int[] x = new int[n1];
        System.out.println("Enter the elements of first array :");
        for(int i = 0; i < n1; i++) {
            //reading array elements
            x[i] = sc.nextInt();
        }
        //create second array
        int[] y = new int[n2];
        System.out.println("Enter the elements of second array :");
        for(int i = 0; i < n2; i++) {
            //reading array elements
            y[i] = sc.nextInt();
        }

        // solution
        boolean ans = isDirectlyProportional(x, y);
        if(ans){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }

    public static boolean isDirectlyProportional(int[] x, int[] y){
        if(x.length != y.length){
            return false;
        }else{
            float proConstant = x[0]/y[0];
            for(int i = 0; i < x.length ; i++){
                if(x[i]/y[i] != proConstant ){
                    return false;
                }
            }
        }
        return true;
    }
}
