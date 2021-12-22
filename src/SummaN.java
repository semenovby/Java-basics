import java.util.Scanner;

//Написать программу, которая вычисляет сумму первых N членов ряда:
//1 + (1/2) + (1/3) + (1/4) + … + (1/N)
//N задается с клавиатуры.
//
//Пример работы такой программы
//Введите N:
//15
//Сумма первых 15 членов ряда равна 3.3182

public class SummaN {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int del = in.nextInt();
        in.close();

        int a = del;
        double i = 1;
        double resultFinal = i;

        for (int n = 2; n <= a; n++) {
            resultFinal = resultFinal + i / n;
        }
        System.out.println("Сумма ряда до 1/" + a + " = " + resultFinal);
    }
}
