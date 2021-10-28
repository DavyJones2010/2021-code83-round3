package store;

/**
 * @author davywalker
 */
public class Store {
    Item[] items;

    public Store(Item[] items) {
        this.items = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            this.items[i] = ItemFactory.generateItem(item);
        }
    }

    public void updateValue() {
        for (Item item : items) {
            item.updateValue();
        }
    }
}