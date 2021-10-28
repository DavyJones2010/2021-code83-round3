package store;

/**
 * @author davywalker
 */
public class ShowTicket extends Item {

    public ShowTicket(String name, int sellIn, int value) {
        super(name, sellIn, value);
        if (isExpire()) {
            this.value = MIN_VALUE;
        }
    }

    @Override
    public void updateValue() {
        this.sellIn--;
        if (outOfTenDays()) {
            this.value += 1;
        }
        if (inTenDays()) {
            this.value += 2;
        }
        if (inFiveDays()) {
            this.value += 3;
        }
        if (isExpire()) {
            this.value = MIN_VALUE;
        }
        formatValue();
    }

    /**
     * 在开场前10天外
     *
     * @return
     */
    public boolean outOfTenDays() {
        return this.sellIn > 10;
    }

    /**
     * 在开场前10天内
     *
     * @return
     */
    public boolean inTenDays() {
        return this.sellIn > 5 && this.sellIn <= 10;
    }

    /**
     * 在开场前5天内
     *
     * @return
     */
    public boolean inFiveDays() {
        return this.sellIn > 0 && this.sellIn <= 5;
    }
}
