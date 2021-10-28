package store;

/**
 * @author davywalker
 */
public enum ItemType {
    /**
     * Aged Wine
     */
    AGED_WINE("Aged Wine"),
    /**
     * Show Ticket
     */
    SHOW_TICKET("Show Ticket"),
    /**
     * Sulfuras
     */
    SULFURAS("Sulfuras"),
    /**
     * Cure
     */
    CURE("Cure"),
    /**
     * Default
     */
    DEFAULT("Default"),
    ;
    private final String type;

    ItemType(String type) {
        this.type = type;
    }

    public static ItemType parse(String type) {
        for (ItemType value : ItemType.values()) {
            if (value.type.equals(type)) {
                return value;
            }
        }
        return DEFAULT;
    }
}
