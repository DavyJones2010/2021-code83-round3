package store;

/**
 * @author davywalker
 */
public class Sulfuras extends Item {
    Item i;

    public Sulfuras(Item i) {
        super(i.name, i.sellIn, i.value);
        this.i = i;
    }

    @Override
    public void updateValue() {
    }
}
