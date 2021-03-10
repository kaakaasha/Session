import java.io.*;
import java.util.Scanner;

public class Expercise_8 {
    public static void Expercise8() throws IOException {

        System.out.println("Напишите программу , которая создает файл , компоненты которого имеют структуру : \n " +
                "табельный номер , ФИО , оклад. Введите данные о 5 работниках ,а в другой выведите данные о работкнике , имеющий максимальный оклад \n" +
                "Введите: ");

        FileOutputStream wr = new FileOutputStream("file.txt", true); //Создаем объект записи
        Scanner scan = new Scanner(System.in);

        for (int i = 1;i<6;i++) {
            System.out.println("ФИО "+ i + " работника" );
            String tx = scan.next();
            wr.write(tx.getBytes());
            wr.write(" ".getBytes());

            System.out.println("Табельный номер "+ i + "работника" );
            String t = scan.next();
            wr.write(t.getBytes());
            wr.write(" ".getBytes());

            System.out.println("Оклад "+ i + "работника" );
            String txt = scan.next();
            wr.write(txt.getBytes());
            wr.write("\n".getBytes());
        }
        wr.close();

        Scanner re = new Scanner(new File("file.txt")); //Создаем объект чтения

        String ot = null;
        System.out.println("Вы ввели данные о 5 работниках: ");
        int s;
        s = 0;
        while (re.hasNextLine())
        {
            String text = re.nextLine();    //Присваиваем text знчаение строки из документа
            System.out.println(text);
            String[] retval = text.split(" ");//Делим строку на слова м записываем в массив
            int retv = Integer.parseInt (retval[2]); //Конвертируем стринг в число
            if (s < retv)
            {
                s = retv;
                ot = retval[0] + " " + retval[1] + " " + retval[2];
            }
        }
        System.out.println("Работник имебщий максимальный оклад: " + ot);
    }

}
