package org.itstep;

public class SecondTask {
    public static void main(String[] args) {
        //Вариант 2. Дана строка, состоящая из произвольных символов. Найти в ней первый неповторяющийся символ.
        String s = "первый неповторяющийся символ";
        System.out.println("Дана строка:  " + s);
        StringBuilder sb = new StringBuilder(s);
        char symbol = sb.charAt(0);
        int k = -1;
        for (int i = 1; i < sb.length(); i++) {
            int result = 1;
            for (int j = i; j < sb.length(); j++)
                if (symbol == sb.charAt(j)) result++;
            if (result == 1) {
                k = i;
                break;
            }
            else symbol = sb.charAt(i);
        }
        System.out.println("Определен первый неповторяющийся символ в строке: " + sb.charAt(k));
    }
}
