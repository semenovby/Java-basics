public class ArrayNew {
    public static void main(String[] args) {
        int[] Array = new int[10];                                           //создание массива
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

        int finder = 8;                                                       //поиск знаения ячейки
        for (int cell = 0; cell < 10; cell++) {
            System.out.println(Array[cell]);
            if (Array[cell] == finder) {                                      //совпадение искомого значения
                for (int slider = cell; slider < 9; slider++) {               //сдвиг массива влево
                    Array[slider] = Array[slider + 1];
                }
            }
        }
        for (int cell = 0; cell < 10; cell++) {
            System.out.println("ячейка [" + cell + "] имеет значение " + Array[cell]); //вывод результатов
        }
    }
}
