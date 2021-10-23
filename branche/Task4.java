package by.epam.module1.branche;
//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//отверстие.
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        double squareHole = A * B;
        double min = Math.min(Math.min(x, y), z);
        double max = Math.max(Math.max(x, y), z);
        double mid = x + y + z - min - max;

        double squareBrick = mid * min;

        if (squareHole >= squareBrick) {
            System.out.println("Кирпич пройдет через отверстие");
        } else {
            System.out.println("Кирпич не пройдет через отвертие");
        }
    }
}
