package by.epam.module1.linear_program;
//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//дробную и целую части числа и вывести полученное значение числа.
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        int y = (int) (x);
        double z = x - y;
        double f = z * 1000;
        double h = (x - z) / 1000;
        double j = f + h;

        System.out.printf("%.3f", j);
        
    }
}
//Перерешал после нескольких месяцев занятий.
class Test {
    public static void main(String[] args) {
        double d = 456.556;

        double d1 = reversePartsOfNumber(d);

        System.out.printf("%.3f", d1);
    }

    public static double reversePartsOfNumber(double d) {
        return (d - (int) d) * 1000 + (int) d / 1000.00;
    }
}