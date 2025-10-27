package aa90_DesignPatterns.aa92_Builder.v0;

public class V0_Client
{
    public static void main(String[] args)
    {
        // Way 1: Parameters inside a constructor
        // Way 2: Using Setters
        // Way 3: Use a map

        // Way 4: Use a Helper/Builder class


    }

    public static void builder(){
        // v0 - Basic
        SoldItemBuilder soldItemBuilder = new SoldItemBuilder();
        soldItemBuilder.setName("Sold Item");
        soldItemBuilder.setId(1L);
        SoldItem soldItem = new SoldItem(soldItemBuilder);

        // why exposing sold item builder to client we just need a object right

        SoldItemBuilder soldItemBuilder1 = SoldItem.getBuilder(); // Object provided here
        soldItemBuilder1.setName("Sold Item 1");
        soldItemBuilder1.setId(2L);
    }
}
