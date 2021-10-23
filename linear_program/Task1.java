package by.epam.module1.linear_program;

import java.util.Scanner;
//Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = scanner.nextInt();
        System.out.println("Введите число b");
        int b = scanner.nextInt();
        System.out.println("Введите число c");
        int c = scanner.nextInt();
        int z = ((a - 3) * b / 2) + c;
        System.out.println("Число z равно: " + z);

    }

}
