import java.util.Scanner;

public class Bank {
    /*Мы взяли ссуду в банке под 20% годовых в объеме введенном с клавиатуры.
    Нам интересно, через сколько лет наш долг банку превысит startDebt, введенный с клавиатуры?
    Решить задачу в следующих вариантах:
            1. Если мы не выплачиваем ничего вообще.
            2. Если мы платим каждый год 10% от начальной суммы.
            3. Если мы платим каждый год 10% от накопившегося долга.
    */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму кредита и нажмите ENTER: ");
        double startDebt = in.nextInt();
        in.close();
        double totalDebt = startDebt;
        System.out.println("Вы взяли кредит на сумму = " + totalDebt);
        int bankPersent = 20;
        int persentTotalDebt = 0;
        int persentDolg = 0;

        double difference = 0;
        int countYears = 0;
        for (int years = 1; difference < startDebt; years++) {
            if (persentDolg != 0) {
                totalDebt = (totalDebt + totalDebt * bankPersent / 100) - totalDebt * persentDolg / 100;
                difference = totalDebt - startDebt;
                countYears++;
            } else if (persentTotalDebt != 0) {
                totalDebt = (totalDebt + totalDebt * bankPersent / 100) - startDebt * persentTotalDebt / 100;
                difference = totalDebt - startDebt;
                countYears++;
            } else if (persentDolg == 0 && persentTotalDebt == 0) {
                totalDebt = totalDebt + totalDebt * bankPersent / 100;
                difference = totalDebt - startDebt;
                countYears++;
            }
        }
        System.out.println("Cпустя " + countYears + " года(лет) Ваш долг банку превысил изначально взятую сумму " + startDebt + " и составил = " + totalDebt);
    }
}
