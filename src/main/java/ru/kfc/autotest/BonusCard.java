package ru.kfc.autotest;

public class BonusCard implements BankCard {
    private String cardName;
    private double balance;
    private double bonusPoints;


    public BonusCard(String cardName) {
        this.cardName = cardName;
        this.balance = 0;
        this.bonusPoints = 0;
    }

    @Override
    public void getBalance() {
        System.out.println("Баланс СберБонус: " + balance + " руб.");
        System.out.println("Бонусные баллы: " + bonusPoints);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Пополнение СберБонус: " + amount + " руб.");
        System.out.println("Бонусные баллы: " + bonusPoints);
    }

    @Override
    public void purchase(double amount) {
        if (balance >= amount) {
            balance -= amount;
            double bonus = amount * 0.01;
            bonusPoints += bonus;
            System.out.println("Покупка на сумму: " + amount + " руб. выполнена успешно");
            System.out.println("Получено бонусных баллов: " + bonus);
        }
    }
    // Начисление бонусных баллов в размере 1% после совершения покупки

    @Override
    public void showInfo() {
        System.out.println("Карта: " + cardName);
        getBalance();
    }
}
