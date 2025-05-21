package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {

    public List<T> items;
    int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        items = new ArrayList<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void add(T item) {

        if (items.size() == this.getMaxSize()) {
            throw new RuntimeException("This list is at max size. Cannot add anymore objects");
        } else {
            items.add(item);
        }
    }

    public List<T> getItems() {
        return items;
    }
}
