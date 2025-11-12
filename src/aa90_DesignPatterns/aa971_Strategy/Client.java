package aa90_DesignPatterns.aa971_Strategy;

import java.util.Scanner;

public class Client
{
    public static void main(String[] args) {
        System.out.println("Please enter a strategy for logging in");
        Scanner scanner = new Scanner(System.in);
        LoginStrategy loginStrategy = LoginStrategyFactory.getLoginStrategy(scanner.next());

        loginStrategy.login();
    }
}
