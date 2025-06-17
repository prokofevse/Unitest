package ru.kfc.autotest;

public class Main {
    public static void main(String[] args) {
        BonusCard bonusCard = new BonusCard("СберБонус");
        SavingsCard savingsCard = new SavingsCard("АльфаКопим");

        bonusCard.getBalance();
        savingsCard.getBalance();
        // Изначальный баланс карт

        bonusCard.deposit(10000);
        savingsCard.deposit(20000);
        // Пополнение баланса карт


        bonusCard.purchase(10000);
        savingsCard.purchase(15000);
        // Совершение покупок


        bonusCard.showInfo();
        savingsCard.showInfo();
        // Инфа по картам после совершения операций по ним
    }
}