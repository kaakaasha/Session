import java.io.FileNotFoundException;
import java.io.IOException;

public class Expercise_3 {
    public static void Expercise3() throws IOException {
        System.out.println("Напишите программу вычисления выражения y=(tg(x)+sin(x))*e^cos(x) при x=3.7");
        final double x =3.7;
        final double e =2.718;
        System.out.println("Ответ: y=" + (Math.tan(x)+Math.sin(x))*Math.pow(e,Math.cos(x)) );
    }
}