package ru.kfc.autotest;


public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Иванов Иван", 25);
        Person p3 = new Person("Петров Петр", 30);
        Person p4 = new Person();
        Person p5 = new Person("Петров Петр", 30);

        p1.talk(); // пустой
        p2.talk(); // обычный Иванов
        p3.talk(); // избранный Петров
        p4.talk(); // еще один пустой
        p5.talk(); // обычный Петров

        Person.count();
    }
}