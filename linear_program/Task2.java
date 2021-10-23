package by.epam.module1.linear_program;
//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = s.nextInt();
        System.out.println("Введите число b");
        double b = s.nextInt();
        System.out.println("Введите число c");
        int c = s.nextInt();
        double z = (b + Math.sqrt(b * b + 4 * a * c)) / 2 * a - a * a * a * c + 1 / (b * b);
        System.out.println("Число z: " + z);

    }
}
