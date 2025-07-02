package com.autobots.bank_system;


    public class DepositAccount extends BankAccount {

        public DepositAccount(Client owner, Currency currency) {
            super(owner, currency);
        }

        @Override
        public void deposit(double amount) {
            balance += amount;
            addTransaction("DEPOSIT", amount);
        }

        @Override
        public boolean withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                addTransaction("WITHDRAW", amount);
                return true;
            }
            return false;
        }
    }

