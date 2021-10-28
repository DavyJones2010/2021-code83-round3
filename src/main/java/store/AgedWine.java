package store;

/**
 * @author davywalker
 */
public class AgedWine extends Item {

    public AgedWine(String name, int sellIn, int value) {
        super(name, sellIn, value);
    }

    @Override
    public void updateValue() {
        this.sellIn--;
        this.value++;
        if (isExpire()) {
            // value双倍增加
            this.value++;
        }
        formatValue();
    }
}
