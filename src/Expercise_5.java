
import java.io.FileNotFoundException;
import java.io.IOException;

public class Expercise_5 {
    public static void Expercise5() throws IOException {
        System.out.println("С помощью цикла for напишите программу, выводящую все нечетные числ из диапозона 1..100");
        for (int a = 1; a<101; a++){
            if (a % 2 != 0){
                System.out.println(a);
            }}

    }
}
