package store;

import org.junit.Test;

public class StoreTest {
    @Test
    public void testItem() {
        int sellIn = 0;
        int value = 2;
        Item i = new Item("Item", sellIn, value);
        Store s = new Store(new Item[]{i});
        Store2 s2 = new Store2(new Item[]{new Item("Item", sellIn, value)});
        System.out.println(s.items[0] + "\t" + s2.items[0]);
        for (int j = 0; j < 40; j++) {
            s.updateValue();
            s2.updateValue();
            System.out.println(s.items[0] + "\t" + s2.items[0]);
        }
    }

    @Test
    public void testAgedWine() {
        Item i = new Item("Aged Wine", 1, -2);
        Store s = new Store(new Item[]{i});
        Store2 s2 = new Store2(new Item[]{new Item("Aged Wine", 1, -2)});
        System.out.println(s.items[0] + "\t" + s2.items[0]);
        for (int j = 0; j < 40; j++) {
            s.updateValue();
            s2.updateValue();
            System.out.println(s.items[0] + "\t" + s2.items[0]);
        }
    }

    @Test
    public void testCure() {
        Item i = new Item("Cure", 1, 50);
        Store s = new Store(new Item[]{i});
        Store2 s2 = new Store2(new Item[]{new Item("Cure", 1, 50)});
        System.out.println(s.items[0] + "\t" + s2.items[0]);
        for (int j = 0; j < 40; j++) {
            s.updateValue();
            s2.updateValue();
            System.out.println(s.items[0] + "\t" + s2.items[0]);
        }
    }

    @Test
    public void testSulfuras() {
        Item i = new Item("Sulfuras", -10, -50);
        Store s = new Store(new Item[]{i});
        Store2 s2 = new Store2(new Item[]{new Item("Sulfuras", -10, -50)});
        System.out.println(s.items[0] + "\t" + s2.items[0]);
        for (int j = 0; j < 40; j++) {
            s.updateValue();
            s2.updateValue();
            System.out.println(s.items[0] + "\t" + s2.items[0]);
        }
    }

    @Test
    public void testShowTicket() {
        Item i = new Item("Show Ticket", 1, 0);
        Item i2 = new Item("Show Ticket", 11, 0);
        Store s = new Store(new Item[]{i, i2});
        Store2 s2 = new Store2(new Item[]{new Item("Show Ticket", 1, 0), new Item("Show Ticket", 11, 0)});
        System.out.println(s.items[0] + "\t" + s2.items[0]);
        for (int j = 0; j < 40; j++) {
            s.updateValue();
            s2.updateValue();
            System.out.println(s.items[0] + "\t" + s2.items[0]);
            System.out.println(s.items[1] + "\t" + s2.items[1]);
            System.out.println("----------------------------------");
        }
    }

    @Test
    public void allTest() {
        Item i = new Item("Item", 10, 20);
        Item i2 = new Item("Aged Wine", 10, 20);
        Item i3 = new Item("Cure", 10, 50);
        Item i4 = new Item("Sulfuras", 10, 50);
        Item i5 = new Item("Show Ticket", 12, 2);
        Store s = new Store(new Item[]{i, i2, i3, i4, i5});

//        Item j = new Item("Item", 10, 20);
//        Item j2 = new Item("Aged Wine", 10, 20);
//        Item j3 = new Item("Cure", 10, 50);
//        Item j4 = new Item("Sulfuras", 10, 50);
//        Item j5 = new Item("Show Ticket", 12, 2);
//        Store s2 = new Store(new Item[]{j, j2, j3, j4, j5});
        for (int k = 0; k < 40; k++) {
            s.updateValue();
            System.out.println("----------------------------------");
        }
    }
}
