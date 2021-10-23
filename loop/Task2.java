package by.epam.module1.loop;
//Вычислить значения функции на отрезке [а,b] c шагом h:
public class Task2 {
    public static void main(String[] args) {
        int a = -3;
        int b = 3;
        int h = 2;

        for (int x = a; x <= b; x += h) {
            int y = x >= 2 ? x : -x;
            System.out.println("y in " + x + " = " + y);
        }
    }
}
