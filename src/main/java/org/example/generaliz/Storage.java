package org.example.generaliz;

import java.util.ArrayList;

public class Storage<T> {
    private ArrayList<T> items;

    public Storage(ArrayList<T> items) {
        this.items = items;
    }

    public void add(T item) {
        items.add(item);
    }

    public T get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > items.size()) {
            throw new IndexOutOfBoundsException("Выход за переделы массива");
        }
        return items.get(index);
    }

    public int size() {
        return items.size();
    }
}
