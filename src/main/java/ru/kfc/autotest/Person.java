package ru.kfc.autotest;

public class Person {
    String fullName;
    int age;
    int id;
    private static int counter = 0;


    public Person() {
        this.fullName = null;
        this.age = 0;
        this.id = counter++;
        // конструктор без параметров
    }


    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
        this.id = counter++;
        // конструктор с параметрами
    }

    public void talk() {
        if ((fullName == null || fullName.isEmpty()) && age == 0) {
            // ничего не возвращаем, т.к. имя и возраст не заданы
            return;
        }
        if (id == 2) {
            System.out.println("Привет я, " + fullName + ", избранный!");
            // возвращаем, если id==2
        } else {
            System.out.println("Привет я " + fullName + " и мне " + age + " лет");
        }
        // возвращаем, если имя и возраст заданы
    }

    public static void count() {
        System.out.println("Количество объектов: " + counter);
    }
    // метод count
}