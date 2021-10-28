package store;

public class ShowTicket extends Item {
    public ShowTicket(String name, int sellIn, int value) {
        super(name, sellIn, value);
    }

    @Override
    public void updateValue() {
        this.sellIn--;
        if (this.sellIn > 10) {
            this.value += 1;
        } else if (this.sellIn > 5 && this.sellIn <= 10) {
            this.value += 2;
        } else if (this.sellIn > 0 && this.sellIn <= 5) {
            this.value += 3;
        } else if (this.sellIn <= 0) {
            this.sellIn = 0;
            this.value = 0;
        }
        formatValue();
    }
}
