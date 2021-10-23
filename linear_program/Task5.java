package by.epam.module1.linear_program;
//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        System.out.println((T / 3600) + "ч " + ((T / 60) % 60) + "мин " + (T % 60) + "с");
    }
}
