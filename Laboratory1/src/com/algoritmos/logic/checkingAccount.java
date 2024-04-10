/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algoritmos.logic;

import com.algoritmos.Domain.Client;

/**
 *
 * @author DELL
 */
public class checkingAccount extends Account {

    private float interest;

    public checkingAccount() {
    }

    public checkingAccount(float interest) {
        this.interest = interest;
    }

    public checkingAccount(float interest, String AccountName, double balance, Client client) {
        super(AccountName, balance, client);
        this.interest = interest;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public void deposit(double amount) {
        super.setBalance(interesCalculation() + amount);

    }

    @Override
    public void withdraw(double amount) {
        super.setBalance(interesCalculation() - amount);
    }

    @Override
    public double interesCalculation() {

        double interestTotal = super.getBalance()
                * (this.getInterest() / 100) / 12;

        return super.getBalance() + interestTotal;
    }

    @Override
    public String toString() {

        double interestEarned = super.getBalance()
                * (this.getInterest() / 100) / 12;

        double balanceWithInterest = super.getBalance() + interestEarned;

        interestEarned = Math.round(interestEarned * 100.0) / 100.0;
        balanceWithInterest = Math.round(balanceWithInterest * 100.0) / 100.0;

        String result = "Acoount type:Checking Account"
                + "\n-----------------"
                + "\nInterest Rate: " + this.getInterest() + "%"
                + "\nInterest you got:"
                + "\nInterest Earned: " + interestEarned
                + "\nBalance with Interest: " + balanceWithInterest;

        return super.toString() + result;

    }

}
