package by.epam.module1.branche;
//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//он прямоугольным.
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите чему равен первый угол");
        double x = scanner.nextDouble();

        System.out.println("Введите чему равен второй угол");
        double y = scanner.nextDouble();

        if (isTriangleExist(x, y)) {
            System.out.println("Да, есть такой треугольник");

            if (isRightTriangle(x, y)) {
                System.out.println("Треугольник прямоугольный");
            } else {
                System.out.println("Треугольник непрямоугольный");
            }
        } else {
            System.out.println("Нет, трегольника с такими углами не может быть");
        }
    }

    private static boolean isTriangleExist(double x, double y) {
        return x + y < 180;
    }

    private static boolean isRightTriangle(double x, double y) {
        return x + y == 90 || x == 90 || y == 90;
    }
}
