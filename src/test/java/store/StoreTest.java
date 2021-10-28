package store;

import org.junit.Test;

public class StoreTest {
    @Test
    public void testItem() {
        Item i = new Item("a", 10, 20);
        Item i2 = new Item("b", 10, 20);
        Store s = new Store(new Item[]{i2});
        System.out.println(i.toString() + "\t" + i2.toString());
        for (int j = 0; j < 20; j++) {
            i.updateValue();
            s.updateValue();
            System.out.println(i.toString() + "\t" + i2.toString());
        }
    }

    @Test
    public void testAgedWine() {
        Item i = new AgedWine("Aged Wine", 10, 20);
        Item i2 = new Item("Aged Wine", 10, 20);
        Store s = new Store(new Item[]{i2});
        System.out.println(i.toString() + "\t" + i2.toString());
        for (int j = 0; j < 40; j++) {
            i.updateValue();
            s.updateValue();
            System.out.println(i.toString() + "\t" + i2.toString());
        }
    }

    @Test
    public void testCure() {
        Item i = new Cure("Cure", 10, 50);
        Item i2 = new Item("Cure", 10, 50);
        Store s = new Store(new Item[]{i2});
        System.out.println(i.toString() + "\t" + i2.toString());
        for (int j = 0; j < 40; j++) {
            i.updateValue();
            s.updateValue();
            System.out.println(i.toString() + "\t" + i2.toString());
        }
    }

    @Test
    public void testSulfuras() {
        Item i = new Sulfuras("Sulfuras", 10, 50);
        Item i2 = new Item("Sulfuras", 10, 50);
        Store s = new Store(new Item[]{i2});
        System.out.println(i.toString() + "\t" + i2.toString());
        for (int j = 0; j < 40; j++) {
            i.updateValue();
            s.updateValue();
            System.out.println(i.toString() + "\t" + i2.toString());
        }
    }

    @Test
    public void testShowTicket() {
        Item i = new ShowTicket("Show Ticket", 12, 2);
        Item i2 = new Item("Show Ticket", 12, 2);
        Store s = new Store(new Item[]{i2});
        System.out.println(i.toString() + "\t" + i2.toString());
        for (int j = 0; j < 40; j++) {
            i.updateValue();
            s.updateValue();
            System.out.println(i.toString() + "\t" + i2.toString());
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

        Item j = new Item("Item", 10, 20);
        Item j2 = new Item("Aged Wine", 10, 20);
        Item j3 = new Item("Cure", 10, 50);
        Item j4 = new Item("Sulfuras", 10, 50);
        Item j5 = new Item("Show Ticket", 12, 2);
        Store s2 = new Store(new Item[]{j, j2, j3, j4, j5});
        for (int k = 0; k < 40; k++) {
            s.updateValue();
            s2.updateValue2();
            s.print();
            s2.print();
            System.out.println("----------------------------------");
        }
    }
}
