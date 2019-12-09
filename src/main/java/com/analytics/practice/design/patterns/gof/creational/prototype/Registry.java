package com.analytics.practice.design.patterns.gof.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;
        try {
            item = (Item) items.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Dark side");
        movie.setPrice(14.99);
        movie.setRuntime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setTitle("Live Laugh Love");
        book.setPrice(5.99);
        book.setNumberOfPages(234);
        items.put("Book", book);
    }
}
