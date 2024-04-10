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
public abstract class Account {
    
    
    
    protected String AccountName; 
    protected double balance; 
    protected Client client; 

    public Account() {
    }

    public Account(String AccountName, double balance, Client client) {
        this.AccountName = AccountName;
        this.balance = balance;
        this.client = client;
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

    public void setClient(Client client) {
        this.client = client;
    }
    //--------------------------------------------
    //Methods in order to represent the polimorfism
    //--------------------------------------------
    
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount); 
    public abstract double interesCalculation();
    
    //Redefine toString
    @Override
    public String toString(){
 
    String result = "\nBANK ACCOUNT INFORMATION"
                + "\n-----------------"
                + "\nAccount Number: " + this.getAccountName()
                + "\nBalance: " + this.getBalance()
                + "\nAccount Owner: " + this.getClient().toString();

    return result;
}

    
    
    
}

