package store;

/**
 * @author davywalker
 */
public class Cure extends Item {
    public Cure(Item i) {
        super(i);
    }

    @Override
    public void updateValue() {
        this.sellIn--;
        this.value -= 2;
        if (isExpire()) {
            // 双倍下滑
            this.value -= 2;
        }
        formatValue();
    }
}
