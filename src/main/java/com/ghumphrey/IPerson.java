package com.ghumphrey;

public interface IPerson {
    Item addToCart(String itemName);
    Item[] getItemsFromCart();
    String greet(boolean leaving);
}

/*
*   Create two types of people - one happy, one angry. Each person will have money (double), and will be able to purchase
*   items if they have enough money. Give each person money (between $10-$20), and the ability to purchase. Give each 
*   person a greeting based on the type of person they are.
*/