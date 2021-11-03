package org.itstep;

import java.util.Random;

public class FirstTask {
    static int size = 10;
    static int [] arr = new  int [size];
    public static void main(String[] args) {
        // Вариант 2. Дан массив n целых чисел. Найти длину самой длинной возрастающей последовательности.
        filRandom();
        print();
        int maxCount = 0;
        int maxVariant = 0;
        for (int i = 1; i < size; i++) {
            maxVariant++;
            if (arr[i] > arr[i-1]) {
                if (maxCount <= maxVariant) maxCount++;
            }
            else maxVariant = 0;
            //System.out.println(maxCount);
        }
        System.out.println("Максимальная последовательность = " + maxCount);
    }
    public static void filRandom() {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(9)+1;
        }
    }
    public static void print() {
        for (int element:arr) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}
