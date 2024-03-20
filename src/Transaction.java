import java.util.ArrayList;

/**
 * A class to model a transaction in the supermarket
 *
 * @author Dave M
 * @version 20/03/24
 */
public class Transaction
{

    private ArrayList<Item> items;

    public Transaction()
    {
        items = new ArrayList<>();
    }

    /**
     * Adds an item object to the transaction
     *
     * @param anItem the item to add
     */
    public void addItem(Item anItem)
    {
        this.items.add(anItem);
    }

    /**
     * returns the number of items that are currently in the transaction
     *
     * @return the number of items
     */
    public int getNumberOfItems()
    {
        return this.items.size();
    }

    /**
     * Returns the sum of all item in the transaction
     *
     * @return the sum of all item in the transaction
     */
    public int getSubtotal() {
        int subtotal = 0;

        for (Item item : this.items)
        {

            subtotal = subtotal + item.getPrice();
        }

        return subtotal;
    }

    /**
     * Removes last item added to transaction
     */
    public void removeLastItem()
    {
        this.items.remove(items.size() - 1);

        //int lastIndex = this.items,size() -1;
        //this.items.remove(lastIndex);
    }

    /**
     * reduces the total left to pay by the given amount
     * if the given amount is equal to or greater than the subtotal the transaction is clearded and the
     * amount of change to be given is returned
     *
     * @param anAmount the amount to pay towards subtotal
     * @return the amount of change that is due
     */
    public int pay(int anAmount)
    {
        int change = 0;

        if (anAmount >= this.getSubtotal()) {
            change = anAmount - this.getSubtotal();
            this.items.clear();
        }


        return change;
    }

    public void printReceipt()
    {


        System.out.println(" HAPPY SHOPPER SUPERMARKET\n***************************");

        for(Item item : this.items)
        {
            System.out.println(item.getDescription() + ": " + item.getPrice());
        }

        System.out.println("***************************");
        System.out.println("       Total: " + getSubtotal());
    }

}
