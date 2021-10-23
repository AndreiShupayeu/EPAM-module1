package by.epam.module1.branche;
//Найти max{min(a, b), min(c, d)}.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        double min1 = Math.min(a, b);
        double min2 = Math.min(c, d);
        double max = Math.max(min1, min2);

        System.out.println(max);


    }

    }

