package com.autobots.bank_system;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Client {

    private String fullName;
    private String clientId;
    private String pin;
    private List<BankAccount> accounts = new ArrayList<>();

    public Client(String fullName, String pin) {
        this.fullName = fullName;
        this.pin = pin;
        this.clientId = UUID.randomUUID().toString();
    }

    public boolean authenticate(String pin) {
        return this.pin.equals(pin);
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public String getFullName() {
        return fullName;
    }

    public String getClientId() {
        return clientId;
    }

    public String getPin() {
        return pin;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }
}

