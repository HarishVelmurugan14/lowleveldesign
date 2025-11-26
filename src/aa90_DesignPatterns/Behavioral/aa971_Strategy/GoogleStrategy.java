package aa90_DesignPatterns.Behavioral.aa971_Strategy;

public class GoogleStrategy implements LoginStrategy{
    @Override
    public void login() {
        System.out.println("Logging in using Google");
    }
}
