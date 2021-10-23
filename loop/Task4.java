package by.epam.module1.loop;
//Составить программу нахождения произведения квадратов первых двухсот чисел.
import java.math.BigInteger;

public class Task4 {
    public static void main(String[] args) {

        BigInteger s = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++) {
            s = s.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println(s);
    }
}



