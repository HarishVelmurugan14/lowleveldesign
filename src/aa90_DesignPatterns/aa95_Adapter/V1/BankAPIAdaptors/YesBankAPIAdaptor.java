package aa90_DesignPatterns.aa95_Adapter.V1.BankAPIAdaptors;

import aa90_DesignPatterns.aa95_Adapter.V1.BankAPI.BankAPI;
import aa90_DesignPatterns.aa95_Adapter.V1.BankAPI.YesBankAPI;

public class YesBankAPIAdaptor implements BankAPI {
    YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public int checkBalance() {
        return yesBankAPI.getBalance();
    }

    @Override
    public void transferMoney(int amount) {
        yesBankAPI.moneyTransfer(amount);
    }
}
