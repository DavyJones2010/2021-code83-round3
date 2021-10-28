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
                return new AgedWine(item.name, item.sellIn, item.value);
            case SHOW_TICKET:
                return new ShowTicket(item.name, item.sellIn, item.value);
            case SULFURAS:
                return new Sulfuras(item.name, item.sellIn, item.value);
            case CURE:
                return new Cure(item.name, item.sellIn, item.value);
            default:
                return new Item(item.name, item.sellIn, item.value);
        }
    }
}
