package store;

public class Sulfuras extends Item {

    public Sulfuras(String name, int sellIn, int value) {
        super(name, sellIn, value);
    }

    @Override
    public void updateValue() {
        // do nothing
        formatValue();
    }
}
