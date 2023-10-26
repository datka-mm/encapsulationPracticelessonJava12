package com.company;

public class MyTvPult {

    public static void main(String[] args) {
        boolean[] booleanArray = {true, false, true, false, false};
        int[] resultArray = createIntArray(booleanArray);
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] createIntArray(boolean... boolArray) {
        int[] intArray = new int[boolArray.length];
        int currentNum = 1;
        for (int i = 0; i < boolArray.length; i++) {
            if (boolArray[i]) {
                // Если элемент - true, добавляем четное положительное число
                intArray[i] = currentNum + 1;
                currentNum += 2;
            } else {
                // Если элемент - false, добавляем нечетное положительное число
                intArray[i] = currentNum;
                currentNum += 2;
            }
        }
        return intArray;
    }
}