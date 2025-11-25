package aa90_DesignPatterns.Creational.aa92_Builder.v2;

public class V2_Client {
    public static void main(String[] args) {
        // Way 1: Parameters inside a constructor
        // Way 2: Using Setters
        // Way 3: Use a map

        // Way 4: Use a Helper/Builder class
    }

    public static void builder() {
        // Previous
        SoldItemBuilder soldItemBuilder2 = SoldItem.getBuilder();
        soldItemBuilder2.setName("Sold Item 2")
                .setId(3L)
                .setDiscount(3.0);
        SoldItem soldItem = new SoldItem(soldItemBuilder2);

        // We just need soldItem Builder to be used inside Sold Item then we can have that inside soldItem class right ?
        // V3

        SoldItem soldItem1 = SoldItem.getBuilder()
                .setName("Sold Item 1")
                .setId(1L)
                .setPrice(2.0)
                .build();
        // This way the client won't know that there is a builder class present
    }
}
