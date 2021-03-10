import java.io.FileNotFoundException;
import java.io.IOException;

public class Expercise_4 {
    public static void Expercise4() throws IOException {
        System.out.println("Напишите программу, выводящую на экран 10 строк по 5 случайных чиел в диапозоне 0..36");
        for(int a = 0; a < 10; a++){
            System.out.println('\n');
            for (int i =0; i<5; i++ ){
                double rnd = Math.random() * 36.036036036;
                System.out.print(rnd + ", ");
            }}
    }
}
