package store;

/**
 * @author davywalker
 */
public class AgedWine extends Item {

    public AgedWine(Item i) {
        super(i);
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