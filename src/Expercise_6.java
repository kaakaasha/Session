import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Expercise_6 {
    public static void Expercise6() throws IOException {
        System.out.println("Определите наименьший общий делитель трех натуральных чисел \n Введите 3 числа: ");
        Scanner scan = new Scanner(System.in);
        int a, b, c, x = 0;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        for(int i = 2; i < 11; i++){
            if ((a % i == 0) && (b % i == 0) && (c % i == 0))
                x = i;
        }
        if (a != 0) {
            System.out.println("Общий делитель: " + x);
        }
        else
            System.out.println("Общего деления не существует");

    }
}
