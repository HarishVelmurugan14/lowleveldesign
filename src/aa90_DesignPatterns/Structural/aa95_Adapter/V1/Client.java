package aa90_DesignPatterns.Structural.aa95_Adapter.V1;

public class Client
{
    public static void main(String[] args)
    {

//        Adapter Pattern
//        ---------------
//                Need: Make two incompatible interfaces work together.
//        How it solves: Wraps one interface with another so existing code can use it without changes.
//
//        Business Examples:
//        1. Payment Adapter – Convert your app’s payment format to Razorpay/Stripe’s expected format.
//        2. Shipping Provider Adapter – Standardize APIs of FedEx, Delhivery, DTDC under one interface.
//        3. Legacy System Adapter – Wrap old ERP responses to match your modern app’s data model.

        PhonePe phonePe = new PhonePe();
        phonePe.rechargeFastTag(100);
    }
}
