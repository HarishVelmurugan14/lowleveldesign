package inventoryManagementSystem;

public class Item implements Comparable<Item>
{
    private String id;
    private String name;
    private int quantity;
    private double price;
    public Item()
    {
    }

    public Item(String id, String name, int quantity, double price)
    {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Item o)
    {
        /*
        * "this" -> current item win => return -1
        * other -> other item win => return 1
        * */
        if(this.quantity > o.quantity)
        {
            return 1;
        }

        if(this.quantity < o.quantity)
        {
            return -1;
        }
        return 0;

        // return this.quantity - o.quantity; // another way to sort
//        return this.name.compareTo(o.name); // sorted on name
    }
}
