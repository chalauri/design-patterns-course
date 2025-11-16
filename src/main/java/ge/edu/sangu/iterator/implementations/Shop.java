package ge.edu.sangu.iterator.implementations;

import ge.edu.sangu.iterator.dto.Item;
import ge.edu.sangu.iterator.interfaces.Aggregate;
import ge.edu.sangu.iterator.interfaces.Iterator;

public class Shop implements Aggregate<Item> {

    private final Item[] items;

    public Shop(Item[] items) {
        this.items = items;
    }

    @Override
    public Iterator<Item> createIterator() {
        return new ItemIterator(items);
    }
}
