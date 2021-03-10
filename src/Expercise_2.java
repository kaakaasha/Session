import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Expercise_2 {
    public static void Expercise2() throws IOException {
        System.out.println("Выбрано задание 2: \n Напишите программу среднего геометрического модулей двух введенных с клавиатуры целых чисел X и Y .\n" +
                " Программа должна использовать цикл While. Условие выхода из цикла - значение числа, равное 999. \n Введите значения X и Y");
        Scanner scan = new Scanner(System.in);
        double X, Y, Z ;
        X = scan.nextFloat();
        Y = scan.nextFloat();
        do {
            Z = Math.sqrt(Math.abs(X)*Math.abs(Y));
        }
        while ((Z > 999) && (Z < 999));
        System.out.println("Ответ : " + Z );

    }
}

