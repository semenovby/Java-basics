import java.util.Scanner;

public class Bank {
    /*Мы взяли ссуду в банке под 20% годовых в объеме введенном с клавиатуры.
    Нам интересно, через сколько лет наш долг банку превысит totalDebt, введенный с клавиатуры?
    Решить задачу в следующих вариантах:
            1. Если мы не выплачиваем ничего вообще.
            2. Если мы платим каждый год 10% от начальной суммы.
            3. Если мы платим каждый год 10% от накопившегося долга.
*/
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Для активации программы введи любое целое число и нажми ENTER: ");
        double totalDebt = in.nextInt();
        in.close();
        double dolg = totalDebt;
        System.out.println("Вы взяли кредит на сумму = " + dolg);
        int stavka = 20;
        int procentTotalDebt = 0;
        int procentDolg = 10;

        double raznica = 0;
        int countYears = 0;
        for (int years = 1; raznica < totalDebt; years++) {
            if (procentDolg != 0) {
                dolg = (dolg + dolg * stavka / 100) - dolg * procentDolg / 100;
                raznica = dolg - totalDebt;
                countYears++;
            } else if (procentTotalDebt != 0) {
                dolg = (dolg + dolg * stavka / 100) - totalDebt * procentTotalDebt / 100;
                raznica = dolg - totalDebt;
                countYears++;
            } else if (procentDolg == 0 && procentTotalDebt == 0) {
                dolg = dolg + dolg * stavka / 100;
                raznica = dolg - totalDebt;
                countYears++;
            }
        }
        System.out.println("Cпустя " + countYears + " года(лет) Ваш долг банку превысил изначально взятую сумму " + totalDebt + " и составил = " + dolg);
    }
}
