public class ArrayApp {
    public static void main(String[] args) {
        int[] Array = new int[10];
        Array[0] = 8;
        Array[1] = 6;
        Array[2] = 15;
        Array[3] = 4;
        Array[4] = 2;
        Array[5] = 8;
        Array[6] = 13;
        Array[7] = 4;
        Array[8] = 7;
        Array[9] = 9;

        int finder = 13;

        for (int cell = 0; cell < 10; cell++) {
            System.out.println("Ячейка [" + cell + "]" + " имеет значение " + Array[cell]);
            if (Array[cell] == finder) {
                System.out.println("111111111111111111");
                Array[cell] = Array[(finder + cell) % Array.length];
                for (int other = 0; other < Array.length; other++) {
                    if(Array[other] == finder) {

                    Array[other] =Array[(other + 1) % Array.length];
                    }
                }
            }
        }
        for (int cell = 0; cell < 10; cell++) {
            System.out.println("Ячейка [" + cell + "]" + " имеет значение " + Array[cell]);
            if (Array[cell] == finder) {
                System.out.println("111111111111111111");
                Array[cell] = Array[(finder + cell) % Array.length];
                for (int other = 0; other < Array.length; other++) {
                    if(Array[other] == finder) {

                        Array[other] =Array[(other + 1) % Array.length];
                    }
                }
            }
        }
    }
}