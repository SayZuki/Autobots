package com.autobots.bank_system;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class BankAccount {
        protected String accountId;
        protected double balance;
        protected Currency currency;
        protected Client owner;
        protected List<Transaction> transactions = new ArrayList<>();

        public BankAccount(Client owner, Currency currency) {
            this.owner = owner;
            this.currency = currency;
            this.accountId = UUID.randomUUID().toString();
        }

        public abstract void deposit(double amount);
        public abstract boolean withdraw(double amount);

        protected void addTransaction(String type, double amount) {
            transactions.add(new Transaction(type, amount));
        }

        public String getAccountId() {
            return accountId;
        }

        public double getBalance() {
            return balance;
        }

        public Currency getCurrency() {
            return currency;
        }

        public Client getOwner() {
            return owner;
        }

        public List<Transaction> getTransactions() {
            return transactions;
        }
}
