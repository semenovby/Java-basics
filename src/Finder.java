public class Finder {
    public static void main(String[] args) {
        for (int number = 1; number <= 200; number++) {
            int finder = 0;
            int delete = 1;
            while (delete <= number) {
                if (number % delete == 0) {
                    finder++;
                }
                delete++;
            }
            if (finder == 2) {
                System.out.println(number);
            }
        }
    }
}