import java.util.Scanner;

public class Tabs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Для активации программы введи любое целое число и нажми ENTER: ");
        in.nextInt();
        int countGoodAnswer = 0;
        for (int i = 0; i < 10; i++) {
            int a = (int) (Math.random() * 11);
            int b = (int) (Math.random() * 11);
            System.out.print(a + "х" + b + "= ");
            if (a * b == in.nextInt()) {
                System.out.println("Молодец!Правильно!");
                countGoodAnswer++;
            } else {
                System.out.println("ай-яй-яй-яй! " + a + "*" + b + "= " + a * b);
            }
        }
        in.close();
        if (countGoodAnswer == 10) {
            System.out.println("Правильных ответов: " + countGoodAnswer);
            System.out.println("Отлично!");
        } else if ((countGoodAnswer >= 8) && (countGoodAnswer <= 9)) {
            System.out.println("Правильных ответов: " + countGoodAnswer);
            System.out.println("Хорошо!");
        } else if ((countGoodAnswer >= 6) && (countGoodAnswer <= 7)) {
            System.out.println("Правильных ответов: " + countGoodAnswer);
            System.out.println("Удовлетворительно!");
        } else if (countGoodAnswer <= 5) {
            System.out.println("Правильных ответов: " + countGoodAnswer);
            System.out.println("Плохо!");
        }
    }
}
