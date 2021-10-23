package by.epam.module1.loop;
//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i = m + 1; i < n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    System.out.println(j);
            }
        }
    }
}





