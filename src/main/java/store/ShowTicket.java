package store;

/**
 * @author davywalker
 */
public class ShowTicket extends Item {
    Item i;

    public ShowTicket(Item i) {
        super(i.name, i.sellIn, i.value);
        this.i = i;
    }

    @Override
    public void updateValue() {
        this.i.sellIn--;
        if (outOfTenDays()) {
            this.i.value += 1;
        } else if (inTenDays()) {
            this.i.value += 2;
        } else if (inFiveDays()) {
            this.i.value += 3;
        } else {
            this.i.value = MIN_VALUE;
        }
        i.formatValue();
    }

    /**
     * 在开场前10天外
     *
     * @return
     */
    public boolean outOfTenDays() {
        return this.i.sellIn >= 10;
    }

    /**
     * 在开场前10天内
     *
     * @return
     */
    public boolean inTenDays() {
        return this.i.sellIn >= 5 && this.i.sellIn < 10;
    }

    /**
     * 在开场前5天内
     *
     * @return
     */
    public boolean inFiveDays() {
        return this.i.sellIn >= 0 && this.i.sellIn < 5;
    }
}
