package by.epam.module1.loop;
//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (a > 0) {
            int x = a % 10;
            a = a / 10;
            System.out.println(x);
        }
        while (b > 0) {
            int y = b % 10;
            b = b / 10;
            System.out.println(y);
        }
    }
}