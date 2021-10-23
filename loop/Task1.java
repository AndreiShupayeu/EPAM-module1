package by.epam.module1.loop;
//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int a = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum += i;

        }
        System.out.println("Сумма чисел от единицы до введенного: " + sum);
    }
}
