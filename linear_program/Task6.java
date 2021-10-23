package by.epam.module1.linear_program;
//Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//принадлежит закрашенной области, и false — в противном случае:
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату x");
        int x = scanner.nextInt();
        System.out.println("Введите координату y");
        int y = scanner.nextInt();


        if (x >= -2 && x <= 2 && y >= 0 && y <= 4) {
           System.out.println("true");
        } else if (x >= -4 && x <= 4 && y >= -3 && y <=0){
            System.out.println("true");
        }
            else {
            System.out.println("false");
        }

    }
}
