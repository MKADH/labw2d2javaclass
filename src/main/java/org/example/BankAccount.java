package org.example;

import java.time.LocalDate;
public class BankAccount {
 private String  firstName;
 private String lastName;
 private LocalDate doB;
 private int accountNumber;
 private double balance;

// Constructors
    public BankAccount(){
        this.firstName = firstName;
        this.lastName = lastName;
        this.doB = doB;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    //    Getters/Setters
    public String getFirstname(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastname(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public LocalDate getDob(){
        return doB;
    }
    public void setDoB(LocalDate doB){
        this.doB = doB;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    //    Methods
    public void Deposit(double amount){
        balance += amount;
    }

    public void Withdrawal(double amount){
        balance -= amount;
    }

    public void payInterest(double rate) {
        balance += balance * (rate / 100);
    }
}














