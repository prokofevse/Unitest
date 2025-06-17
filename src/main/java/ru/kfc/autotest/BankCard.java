package ru.kfc.autotest;

public interface BankCard {
    void getBalance();
    void deposit(double amount);
    void purchase(double amount);
    void showInfo();
}
// Список методов, которые задействует бонусная и накопительная карта