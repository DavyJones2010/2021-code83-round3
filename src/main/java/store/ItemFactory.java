package store;

/**
 * @author davywalker
 */
public class ItemFactory {

    /**
     * Item工厂
     *
     * @param item
     * @return
     */
    public static Item generateItem(Item item) {
        ItemType itemType = ItemType.parse(item.name);
        switch (itemType) {
            case AGED_WINE:
                return new AgedWine(item);
            case SHOW_TICKET:
                return new ShowTicket(item);
            case SULFURAS:
                return new Sulfuras(item);
            case CURE:
                return new Cure(item);
            default:
                return item;
        }
    }
}
