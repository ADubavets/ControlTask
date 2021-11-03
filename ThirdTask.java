package org.itstep;

import java.lang.reflect.Array;

public class ThirdTask {
    private static int [][] arr = new int [3][3];
    public static void main(String[] args) {
        //Вариант 2. Дан двумерный массив nxn целых чисел. Выполнить его поворот против часовой стрелки.
        // 3. 6. 9.
        // 2. 5. 8.
        // 1. 4. 7.
        fillOrder();
        System.out.println(ArrTostring(arr));
        int [][] brr = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                if(i == 0) brr[i][j] = arr[j][2];
                if(i == 1) brr[i][j] = arr[j][1];
                if (i == 2) brr[i][j] = arr[j][0];
            }
        System.out.println(ArrTostring(brr));

    }
    public static void fillOrder() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                arr[i][j] = j + 1 + i * 3;
    }
    public static String ArrTostring(int [][] crr){

        StringBuilder result = new StringBuilder();
        String separator = ", ";
        for (int i=0;i < crr.length; i++) {
            for (int j = 0; j < crr[i].length; j++) {
                result.append(crr[i][j]);
                if (j != crr[i].length - 1) result.append(separator);
            }
            result.append("\n");
        }
        return result.toString();
    }
}
