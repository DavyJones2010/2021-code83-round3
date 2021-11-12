package store;

/**
 * @author davywalker
 */
public class Cure extends Item {
    Item i;
    public Cure(Item i) {
        super(i.name, i.sellIn, i.value);
        this.i = i;
    }

    @Override
    public void updateValue() {
        this.i.sellIn--;
        this.i.value -= 2;
        if (i.isExpire()) {
            // 双倍下滑
            this.i.value -= 2;
        }
        i.formatValue();
    }
}
