package aa90_DesignPatterns.aa92_Builder.v0;

public class SoldItem
{
    private long id;
    private String name;
    private double price;
    private double discount;
    private int quantity;
    private boolean available;
    private double weight;

    public SoldItem (SoldItemBuilder builder){
        this.id = builder.getId();
        this.name = builder.getName();
    }

    static public SoldItemBuilder getBuilder()
    {
        return new SoldItemBuilder();
    }
}
