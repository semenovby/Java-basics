public class ArrayExercise {
    public static void main(String[] args) {
        int[] Array = new int[100];
        int finder = 5;
        for (int cell = 0; cell < 100; cell++) {
            Array[cell] = cell;
        }
        for (int cell = 0; cell < 100; cell++) {
            System.out.println("Ячейка [" + cell + "]" + " имеет значение " + Array[cell]);
            if (Array[cell] == finder) {
                System.out.println("111111111111111111");
                Array[cell] = Array[(finder + cell) % Array.length];
                for (int other = 0; other < Array.length; other++) {
                    Array[other] = Array[(other + 1) % Array.length];
                }
            }
        }
    }
}



