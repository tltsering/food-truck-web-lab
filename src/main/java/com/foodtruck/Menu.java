package com.foodtruck; //IMPORTANT DO NOT CHANGE
import java.util.HashMap;

public class Menu {

    private HashMap<String, MenuItem> items;

    public Menu() {

        items = new HashMap<>();

        items.put("salad_greek", new Salad("Greek Salad", 7.50));
        items.put("salad_caesar", new Salad("Caesar Salad", 8.25));
        items.put("salad_chicken", new Salad("Chicken Salad", 9.75));
        items.put("salad_green", new Salad("Green Salad", 9.50));
        items.put("salad_spinach", new Salad("Spinach Salad", 6.95));

        items.put("sandwich_turkey", new Sandwich("Turkey Sandwich", 9.50));
        items.put("sandwich_pbj", new Sandwich("Peanut Butter and Jelly Sandwich", 5.25));
        items.put("sandwich_tuna", new Sandwich("Tuna Sandwich", 9.25));
        items.put("sandwich_chicken", new Sandwich("Chicken Sandwich", 8.75));
        items.put("sandwich_egg", new Sandwich("Egg Sandwich", 6.40));

        items.put("drink_water", new Drink("Water", 1.50));
        items.put("drink_juice", new Drink("Juice", 2.75));
        items.put("drink_tea", new Drink("Tea", 2.50));
        items.put("drink_soda", new Drink("Soda", 2.25));
        items.put("drink_coffee", new Drink("Coffee", 2.00));
    }

    public HashMap<String, MenuItem> getAllItems() {
        return items;
    }
}
