package by.epam.module1.branche;
//Вычислить значение функции:
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        if (x<=3){
            System.out.println(x*x-3*x+9);
                    }
        else {
            System.out.println(1/(x*x*x +6));
        }
    }
}
