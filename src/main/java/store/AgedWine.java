package store;

/**
 * @author davywalker
 */
public class AgedWine extends Item {
    Item i;

    public AgedWine(Item i) {
        super(i.name, i.sellIn, i.value);
        this.i = i;
    }

    @Override
    public void updateValue() {
        this.i.sellIn--;
        this.i.value++;
        if (this.i.isExpire()) {
            // value双倍增加
            this.i.value++;
        }
        this.i.formatValue();
    }
}