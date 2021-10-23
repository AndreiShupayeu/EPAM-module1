package by.epam.module1.linear_program;
//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число x");
        double x = s.nextInt();
        System.out.println("Введите число y");
        double y = s.nextInt();
        double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println("Число z: " + z);
    }
}
