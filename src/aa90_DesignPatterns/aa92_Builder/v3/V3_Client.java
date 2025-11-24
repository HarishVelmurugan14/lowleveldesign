package aa90_DesignPatterns.aa92_Builder.v3;


public class V3_Client {

    static void purposeAndSolution(){
//        Builder Pattern
//        ---------------
//        Need: Create complex objects step-by-step without using long, messy constructors.
//        How it solves: Separates the object construction process from the final object, allowing clean and flexible building.
//
//                Business Examples:
//        1. Loan Application Builder – Fill customer info, KYC, income, and loan terms step-by-step.
//        2. Travel Booking Builder – Combine flights, hotels, add-ons, and insurance gradually.
//        3. Insurance Policy Builder – Add base plan, riders, coverage, and nominee info before finalizing.
    }

    public static void main(String[] args) {
        // Way 1: Parameters inside a constructor
        // Way 2: Using Setters
        // Way 3: Use a map

        // Way 4: Use a Helper/Builder class
    }

    public static void builder() {
        // Previous
        SoldItem soldItem1 = SoldItem.getBuilder()
                .setName("Sold Item 1")
                .setId(1L)
                .setPrice(2.0)
                .build();

        //But i am still able to do
        //SoldItemBuilder soldItemBuilder = SoldItem.getBuilder();
        //SoldItem soldItem = new SoldItem(soldItemBuilder);

        // How to enforce first approach alone
        // Make SoldItem Object creation private, it will break soldItem Builder move it as inner class

        // This way we cannot create object for soldItem and we abstract soldItemBuilder
    }
}
