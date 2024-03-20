/**
 * A class to model an item in the supermarket
 * @author Dave M
 * @version 20/03/24
 */
public class Item
{
    private int price;



    private int quantityInStock;
    private String description;

    /**
     *Constructor to create an object of the Item class     *
     * @param aPrice the price of the item in pence (e.g. 150 = £1.50)
     * @param aDescription a description of the item (e.g. "Happy Shopper Fig Rolls")
     */
    public Item(int aPrice, String aDescription)
    {
        this.price = aPrice;
        this.description = aDescription;
    }
    public int getPrice()
    {
        return this.price;
    }


    public int getQuantityInStock() {
        return quantityInStock;
    }
    public String getDescription()
    {
        return this.description;
    }

    public void setPrice(int aPrice) {
        this.price = aPrice;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }


    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    @Override
    public String toString()
    {
        return "An object of " +this.getClass() + " With description " + this.getDescription() + " and price " + this.getPrice() + " pence";
    }
}
