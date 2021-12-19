import javax.swing.*;
import java.awt.print.Printable;
import java.nio.file.FileSystemNotFoundException;
import java.sql.SQLOutput;
import java.util.function.DoubleToIntFunction;

public class Znacheniya {


    //1.3 Максимальное, минимальное и среднее значение
    //Задача:
    //Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
    //Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].

    public static void main(String[] args) {
        double[] Array = new double[100];                                   //создание массива случайных чисел
        System.out.println("================ ЗНАЧЕНИЯ ЯЧЕЕК МАССИВА ================");
        for (int i = 0; i < 100; i++) {
            double a = Math.random();
            Array[i] = a;
            System.out.println("Ячейка " + i + " содержит значение " + "[ " + Array[i] + " ]");
        }
        System.out.println("===================== РЕЗУЛЬТАТЫ =======================");
        double maxNumber = 0;                                               //переменная максимального значения
        int maxCell = 0;
        for (int finder = 1; finder < 99; finder++) {                       //поиск максимального значения
            if (Array[maxCell] <= Array[finder]) {
                maxNumber = Array[finder];
                maxCell = finder;
            }
        }
        System.out.println("Максимальное значение массива = " + maxNumber);

        double minNumber = 0;                                               //переменная минимального значения
        int minCell = 0;
        for (int finder = 1; finder < 99; finder++) {                       //поиск минимального значения
            if (Array[minCell] >= Array[finder]) {
                minNumber = Array[finder];
                minCell = finder;
            }
        }
        System.out.println("Минимальное значение массива = " + minNumber);

        double summ = 0;                                                    //сумма всех значений массива
        double middle = 0;                                                  //среднее значение массива
        for (int i = 0; i < 99; i++) {                                      //поиск суммы значений
            summ = summ + Array[i];
        }
        middle = summ / Array.length;                                       //поиск среднего значения
        System.out.println("Сумма значений массива = " + summ);
        System.out.println("Среднее значение массива = " + middle);
        System.out.println("========================================================");
    }
}