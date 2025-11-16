package ge.edu.sangu.iterator.implementations;

import ge.edu.sangu.iterator.dto.Item;
import ge.edu.sangu.iterator.interfaces.Iterator;

import java.util.NoSuchElementException;

public class ItemIterator implements Iterator<Item> {

    private int currentIndex = 0;
    private final Item[] items;

    public ItemIterator(Item[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < items.length;
    }

    @Override
    public Item next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        return items[currentIndex++];
    }
}
