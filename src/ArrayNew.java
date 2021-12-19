import java.awt.image.AreaAveragingScaleFilter;

public class ArrayNew {
    public static void main(String[] args) {
        int[] Array = new int[10];                                                      //создание массива
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


        int finder = 8;                                                                 //поиск знаения ячейки
        int counter = 0;                                                                //счетчик совпадений

             //проблема со счетчиком(всегда 0)  //создание конечного массива

        for (int cell = 0; cell < 10; cell++) {
            if (Array[cell] == finder) {                                                //совпадение искомого значения
                ++counter;
                for (int slider = cell; slider < 9; slider++) {                         //сдвиг массива влево
                    Array[slider] = Array[slider + 1];
                }


            }
        }
        int[] NewArray = new int[10 - counter];
        for (int newCell = 0; newCell < 10 - counter; newCell++) {              //присвоение в новый массив
            NewArray[newCell] = Array[newCell];
        }
        System.out.println(counter);
        System.out.println("Старый массив:");
        for (int i = 0; i < 10; i++) {                                                  //вывод результатов
            System.out.println("ячейка [" + i + "] имеет значение " + Array[i]);
        }
        System.out.println("Новый массив:");
        for (int i = 0; i < NewArray.length; i++) {                                          //вывод результатов
            System.out.println("ячейка [" + i + "] имеет значение " + NewArray[i]);
        }
    }
}

