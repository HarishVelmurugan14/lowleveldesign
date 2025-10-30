package aa90_DesignPatterns.aa95_Adapter.V1.PhonePeServices;

import aa90_DesignPatterns.aa95_Adapter.V1.BankAPI.BankAPI;

public class FastTagRecharge
{
    public boolean recharge(int amount, BankAPI bankAPI)
    {
        if(amount <= bankAPI.checkBalance())
        {
            System.out.println("Recharge Successful");
            return true;
        }

        System.out.println("Insufficient Balance");
        return false;
    }
}
