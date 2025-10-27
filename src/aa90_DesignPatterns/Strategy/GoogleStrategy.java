package aa90_DesignPatterns.Strategy;

public class GoogleStrategy implements LoginStrategy{
    @Override
    public void login() {
        System.out.println("Logging in using Google");
    }
}
