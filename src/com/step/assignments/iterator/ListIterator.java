package com.step.assignments.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ListIterator {
    private List<Integer> list;
    private int currentIndex;

    public ListIterator(List<Integer> list) {
        this.list = list;
        this.currentIndex=-1;
    }

    public boolean hasNext() {
        return currentIndex < list.size();
    }

    public int next() {
        if (this.hasNext()) {
            int item = list.get(++currentIndex);
            return item;

        }
        throw new NoSuchElementException("Not Found");
    }
}