package aa90_DesignPatterns.aa92_Builder.v1;

public class V1_Client {
    public static void main(String[] args) {
        // Way 1: Parameters inside a constructor
        // Way 2: Using Setters
        // Way 3: Use a map

        // Way 4: Use a Helper/Builder class
    }

    public static void builder() {
        // Previous

        SoldItemBuilder soldItemBuilder1 = SoldItem.getBuilder(); // Object provided here
        soldItemBuilder1.setName("Sold Item 1");
        soldItemBuilder1.setId(2L);

        // Problem why soldItemBuilder.set these many time, return this from setter to make it dot notation
        SoldItemBuilder soldItemBuilder2 = SoldItem.getBuilder();
        soldItemBuilder2.setName("Sold Item 2")
                .setId(3L)
                .setDiscount(3.0);
        SoldItem soldItem = new SoldItem(soldItemBuilder1);

        // We just need soldItem Builder to be used inside Sold Item then we can have that inside soldItem class right ?
        // V3
    }
}
