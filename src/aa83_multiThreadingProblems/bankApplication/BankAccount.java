package aa83_multiThreadingProblems.bankApplication;

public class BankAccount
{

//    Objective
//    Learn how to avoid race conditions using synchronized.
//    Problem Statement
//    Implement a BankAccount class with a balance.
//    Create multiple threads representing depositors and withdrawers.
//    Simulate a race condition where multiple users deposit and withdraw simultaneously.
//    Fix the issue using:
//    synchronized methods
//    synchronized blocks
//    Measure execution time with and without synchronization.


    private long balance;

    public long getBalance() {
        return balance;
    }

    public BankAccount(long balance)
    {
        this.balance = balance;
    }

    public synchronized void deposit(int amount)
    {
        balance += amount;
    }

    public synchronized void withdraw(int amount)
    {
        balance -= amount;
    }
}
