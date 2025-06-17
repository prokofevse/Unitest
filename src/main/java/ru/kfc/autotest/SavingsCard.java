package ru.kfc.autotest;

public class SavingsCard implements BankCard {
    private String cardName;
    private double balance;
    private double savings;

    public SavingsCard(String cardName) {
        this.cardName = cardName;
        this.balance = 0;
        this.savings = 0;
    }

    @Override
    public void getBalance() {
        System.out.println("Баланс АльфаКопим: " + balance + " руб.");
        System.out.println("Накоплено: " + savings);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        double savingsAmount = amount * 0.0005;
        savings += savingsAmount;
        System.out.println("Пополнение АльфаКопим: " + amount + " руб.");
        System.out.println("Накоплено: " + savingsAmount);
    }
    // Накопление в размере 0.05% от суммы пополнения

    @Override
    public void purchase(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Покупка на сумму: " + amount + " руб. выполнена успешно");
        }
    }

    @Override
    public void showInfo() {
        System.out.println("Карта: " + cardName);
        getBalance();
    }
}
