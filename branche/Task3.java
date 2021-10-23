package by.epam.module1.branche;
//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        if (pointsOnStraight(x1, y1, x2, y2, x3, y3)) {
            System.out.println("прямые проходят через одну линию");
        } else {
            System.out.println("прямые не проходят через одну линию");
        }
    }

    private static boolean pointsOnStraight(double x1, double y1, double x2, double y2, double x3, double y3) {
        return (y3 - y1) / (y2 - y1) == (x3 - x1) / (x2 - x1);
    }
}
