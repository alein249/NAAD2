package com.streamliners.task3_1;

public class Product {
    String name;
    int price;
    //define empty constructor
    public Product(){
    }
    //define parameterized constructor
    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Name %s and Rs. %d",name,price);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(obj == this){
            return true;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Product pro = (Product) obj;
        return this.price == pro.price && this.name.equals(pro.name);
    }
}
