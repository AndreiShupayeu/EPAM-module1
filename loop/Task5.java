package by.epam.module1.loop;
//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//заданному е. Общий член ряда имеет вид:

public class Task5 {
    public static void main(String[] args) {
        double sum = 0;
        double e = 0;
        for (int i = 1; i < 1000; i++) {
            double ai = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (ai > e) {
                sum += ai;
            } else {
                break;
            }
        }
        System.out.println(sum);
    }
}