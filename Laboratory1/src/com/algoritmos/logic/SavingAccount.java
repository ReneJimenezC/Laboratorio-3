package com.algoritmos.logic;

import com.algoritmos.Domain.Client;

/**
 *
 * @author DELL
 */
public class SavingAccount extends Account {
    //Atributes

    private String startDate;
    private int monthNumber;
    private float interest;

    public SavingAccount() {
    }

    public SavingAccount(String startDate, int monthNumber, float interest) {
        this.startDate = startDate;
        this.monthNumber = monthNumber;
        this.interest = interest;
    }

    public SavingAccount(String startDate, int monthNumber,
            float interest, String AccountName,
            double balance, Client client) {

        super(AccountName, balance, client);
        this.startDate = startDate;
        this.monthNumber = monthNumber;
        this.interest = interest;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
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

        double interestTotal
                = super.getBalance()
                * (this.getInterest() / 100)
                * this.getMonthNumber();

        return super.getBalance() + interestTotal;

    }

    public String toString() {

        double interestEarned = super.getBalance()
                * (this.getInterest() / 100)
                * this.getMonthNumber();
        double balanceWithInterest = super.getBalance() + interestEarned;
        
        interestEarned = Math.round(interestEarned * 100.0) / 100.0;
    balanceWithInterest = Math.round(balanceWithInterest * 100.0) / 100.0;

        

        String result = "Acoount type:saving account"
                + "\n-----------------"
                + "\nsaving star Date: " + this.getStartDate()
                + "\nMonths: " + this.getMonthNumber()
                + "\nInterest Rate: " + this.getInterest() + "%"
                + "\nInterest you got:"
                + "\nInterest Earned: " + interestEarned
                + "\nBalance with Interest: " + balanceWithInterest;
             
         return super.toString() + result;

    }

}
