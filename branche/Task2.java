package by.epam.module1.branche;
//Найти max{min(a, b), min(c, d)}.

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите два числа из которых программа выберет минимальное:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double min1 = Math.min(a, b);
        System.out.println("Минимальное число: " + min1);

        System.out.println("Укажите еще два числа из которых программа выберет минимальное:");
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double min2 = Math.min(c, d);
        System.out.println("Минимальное число: " + min2);

        double max = Math.max(min1, min2);
        System.out.println("А максимальным из этих двух минимумов будет число: "+max);
    }
}



