package store;

public class AgedWine extends Item {
    public AgedWine(String name, int sellIn, int value) {
        super(name, sellIn, value);
    }

    public void updateValue() {
        this.sellIn--;
        this.value++;
        if (this.sellIn <= 0) {
            // value双倍增加
            this.value++;
        }
        formatValue();
    }
}
