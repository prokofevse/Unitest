package ru.kfc.autotest;

import java.util.Random;

public class homework {

    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();// Создаётся массив из 20 элементов


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50); // Заполнение массива случайными числами от 0 до 51
        }

        System.out.println();
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // Вывод элементов массива


        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        } // Поиск наибольшего элемента


        int sum = 0;
        for (int num : array) {
            sum += num;
        } // Подсчёт суммы элементов


        System.out.println(max);
        System.out.println(sum);
    } // Вывод максимального значения и общей суммы всех значений из массива
}