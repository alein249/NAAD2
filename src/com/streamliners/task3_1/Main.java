package com.streamliners.task3_1;

public class Main {
    public static void main(String[] args){
        Product pro1 = new Product("Realme",8000);
        Product pro2 = new Product("Realme",8000);
        Product pro3 = new Product("Samsung",9000);
        System.out.println(pro1.equals(pro2));
        SpecialProduct specialProduct = SpecialProduct.applyOffOnProduct(pro1,20);
        System.out.println(specialProduct);
    }
}
