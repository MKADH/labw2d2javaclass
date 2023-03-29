package org.example;
import java.time.LocalDate;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();

        bankAccount1.setFirstName("Khalid");
        System.out.println(bankAccount1.getFirstname());
        bankAccount1.setLastName("Hussein");
        System.out.println(bankAccount1.getLastname());
        bankAccount1.setDoB(LocalDate.parse("1999-02-13"));
        System.out.println(bankAccount1.getDob());
        bankAccount1.setAccountNumber(90898);
        System.out.println(bankAccount1.getAccountNumber());
        bankAccount1.setBalance(0.0);
        System.out.println(bankAccount1.getBalance());


        bankAccount1.Deposit(10000.0);
        bankAccount1.Withdrawal(2000);
        bankAccount1.payInterest(-10);
        System.out.println("Current Account Balance: "+ bankAccount1.getBalance());

    }
}