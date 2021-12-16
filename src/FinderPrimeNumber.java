public class FinderPrimeNumber {
    public static void main(String[] args) {
        for (int num = 2; num < 200; num++) {
            boolean n = true;
            for (int del = 2; del < num; del++) {
                if (num % del == 0) {
                    n = false;
                }
            }
            if (n == true) {
                System.out.println(num);
            }
        }
    }
}


