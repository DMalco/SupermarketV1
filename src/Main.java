// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        Item i = new Item(115, "TAYTO CHEESE AND ONION 956");
        //System.out.println(i.toString());
        Item i2 = new Item(200, "KITTY KIBBLE");
        //System.out.println(i2.toString());
        Item i3 = new Item(250, "FANCY CHOCOLATE");
        Item i4 = new Item(150, "FANCY BICCIES");
        Item i5 = new Item(120, "LEMON PLEDGE 500ML");

        Transaction t = new Transaction();
        //t.addItem(i);
        t.addItem(i2);
        t.addItem(i3);
        t.addItem(i4);
        //t.addItem(i5);

        //System.out.println(t.getNumberOfItems());
       // t.removeLastItem();
       // t.removeLastItem();
       // t.removeLastItem();

        //System.out.println("Total Items: " + t.getNumberOfItems());

        //System.out.println("Subtotal: " + t.getSubtotal());

        //System.out.println("Change: " + t.pay(1000));

        t.printReceipt();

    }
}