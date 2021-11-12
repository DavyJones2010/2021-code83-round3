package store;

/**
 * @author davywalker
 */
public class Item implements Updatable {
    public String name;
    public int sellIn;
    public int value;

    public static final Integer MIN_VALUE = 0;
    public static final Integer MAX_VALUE = 50;

    public Item(String name, int sellIn, int value) {
        this.name = name;
        this.value = value;
        this.sellIn = sellIn;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.value;
    }

    @Override
    public void updateValue() {
        this.sellIn--;
        this.value--;
        if (isExpire()) {
            // 双倍下滑
            this.value--;
        }
        formatValue();
    }

    public void formatValue() {
        if (this.value <= MIN_VALUE) {
            this.value = MIN_VALUE;
        } else if (this.value >= MAX_VALUE) {
            this.value = MAX_VALUE;
        }
    }

    /**
     * 是否已经失效, 这里待验证, 是<0, 还是<=0?
     *
     * @return
     */
    public boolean isExpire() {
        return sellIn < 0;
    }
}
