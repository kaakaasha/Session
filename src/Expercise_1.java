import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Expercise_1 {
    public static void Expercise1() throws IOException {
        System.out.println("Выбрано задание 1 :\n Разработайте приложение для вычисление корней квадратного уравнения ax^2+bx+c=0 \n Введите a, b, c, x : " );
        Scanner scanner = new Scanner(System.in);
        int a, b, c, x;
        float d;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        x = scanner.nextInt();
        d = b * b - 4 * a * c;
        System.out.println("1 корень: " + (-b + Math.sqrt(b*b -4*a*c))/(2*a));
        System.out.println("2 корень: " + (-b - Math.sqrt(b*b -4*a*c))/(2*a));

    }
}
