package com.streamliners.task3_2;

public class Main {
    public static void main(String[] args) {
        GroceryCartItem item1 = new GroceryCartItem("Sugar",40);
        GroceryCartItem item2 = new GroceryCartItem("Tomato",60);
        GroceryCartItem item3 = new GroceryCartItem("Potato",50);
        GroceryCartItem item4 = new GroceryCartItem("Mango",30);
        Cart cart = new Cart();
        cart.add(GroceryCartItem.createNew(item1,"3kg 0g"))
                .add(GroceryCartItem.createNew(item2,"0kg 7g"))
                .add(GroceryCartItem.createNew(item3,"1kg 5g"))
                .add(GroceryCartItem.createNew(item4,"3kg 5g"));
        System.out.println(cart);
    }
}