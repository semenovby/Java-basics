import javax.swing.*;

public class ArrayS {
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

        int finder = 15;
        for (int cell = 0; cell < 10; cell++) {
            System.out.println(Array[cell]);
            if (Array[cell] == finder) {
                Array[cell] = Array[cell + 1];
                System.out.println("11111111111111"+Array[cell]);
            }
        }
        for (int cell = 0; cell < 10; cell++) {
            System.out.print(Array[cell] + " ");
        }

    }


}



