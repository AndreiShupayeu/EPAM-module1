package by.epam.module1.loop;
//Найти сумму квадратов первых ста чисел.
public class Task3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i=0; i<=100; i++){
             sum +=i*i;
        }
        System.out.println(sum);
    }
}
