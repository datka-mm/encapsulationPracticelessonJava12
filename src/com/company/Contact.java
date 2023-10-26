package com.company;

public class Contact {

    public static void main(String[] args) {

        System.out.println(getWord(9, false, "Java", "peaksoft", "house", "index"));
    }

    public static String getWord(int index, boolean isUpperCase, String ... array) {

        for (int i = 0; i < array.length; i++) {
            if (index == i) {
                if (isUpperCase) {
                    return array[i].toUpperCase();
                } else {
                    return array[i].toLowerCase();
                }
            }
        }
        return "Varargs' та мындай индекс жок!";
    }
}
