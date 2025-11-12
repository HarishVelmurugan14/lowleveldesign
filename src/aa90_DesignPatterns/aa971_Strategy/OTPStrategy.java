package aa90_DesignPatterns.aa971_Strategy;

public class OTPStrategy implements LoginStrategy{
    @Override
    public void login() {
        System.out.println("Logging in using OTP");
    }
}
