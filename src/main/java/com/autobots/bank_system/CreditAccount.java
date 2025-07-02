package com.autobots.bank_system;

public class CreditAccount extends BankAccount {
    private static final double CREDIT_LIMIT = -1000;

    public CreditAccount(Client owner, Currency currency) {
        super(owner, currency);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        addTransaction("DEPOSIT", amount);
    }

    @Override
    public boolean withdraw(double amount) {
        if ((balance - amount) >= CREDIT_LIMIT) {
            balance -= amount;
            addTransaction("WITHDRAW", amount);
            return true;
        }
        return false;
    }
}
