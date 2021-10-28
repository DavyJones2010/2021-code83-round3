package store;

// Please don't modify the class name.
public class Item {

    public String name;

    public int sellIn;

    public int value;

    // Please don't modify the signature of this method.
    public Item(String name, int sellIn, int value) {
        this.name = name;
        this.value = value;
        this.sellIn = sellIn;
        formatValue();
    }

    // Please don't modify the signature of this method.
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.value;
    }

    public void updateValue() {
        this.sellIn--;
        this.value--;
        // 这里待验证, 是<0, 还是<=0?
        if (this.sellIn <= 0) {
            // 双倍下滑
            this.value--;
        }
        formatValue();
    }

    public void formatValue() {
        if (this.value <= 0) {
            this.value = 0;
        } else if (this.value >= 50) {
            this.value = 50;
        }
    }
}
