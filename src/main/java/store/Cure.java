package store;

public class Cure extends Item {
    public Cure(String name, int sellIn, int value) {
        super(name, sellIn, value);
    }

    @Override
    public void updateValue() {
        this.sellIn--;
        this.value -= 2;
        if (this.sellIn <= 0) {
            // 双倍下滑
            this.value -= 2;
        }
        formatValue();
    }
}
