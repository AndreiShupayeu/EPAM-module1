package by.epam.module1.loop;
//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
public class Task6 {
    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println((int) i + " " + i);

        }
    }
}