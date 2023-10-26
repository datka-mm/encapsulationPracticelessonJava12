package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MethodSession {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {

            obshiymenu();
            kanal();

        }
    }

    public static void obshiymenu() {
        System.out.println("""
                 TV пульт.
                 +-----------------------------+
                 | Off                      On |
                 |                             |
                 |<-back     (menu)    next->  |
                 |                             |
                 |   1      2       3       4  |
                 |                             |
                 |   5      6       7       8  |
                 |_____________________________|                            |
                """);

        System.out.println("""
                Телевизорду куйгузуу учун "On" созун жазыныз!
                Телевизорду очуруу учун "Of" созун жазыныз!
                Менюга кируу учун "Menu" созун жазыныз!
                Каалаган каналга отуу учун каналдын номерин жазыныз!
                Кийинки каналга отуу учун "Next" созун жазыныз!
                Арткы каналга отуу учун "Back" созун жазыныз!""");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        switch (action) {
            case "on":
                System.out.println("""
                                        +-----------------------------+
                                        |                             |
                                        |      WELCOME TO SAMSUNG     |
                                        |         SMART TV            |
                                        |                             |
                                        |_____________________________|  
                        """);
                obshiymenu();
                break;
            case "off":
                System.out.println("""
                        +-----------------------------+
                        |                             |
                        |         TV OFF              |
                        |                             |
                        |                             |
                        |_____________________________| 
                                                                   
                         """);
                obshiymenu();
                break;
            case "menu":
                Menu();
                kanal();


        }


    }

    public static void Menu() {
        System.out.println("""
                №1 NTS!
                №2 Баластан!
                №3 Тумар тв!
                №3 КТРК!
                №4 Кыргыз Тв!
                №5 Ысык-Кол Тв!
                №6 РТР!
                №7 Ала-Тоо
                №8 New TV""");
        System.out.println("Канал танданыз!");

        obshiymenu();
        kanal();
    }

    public static void kanal() {
        Scanner scanner = new Scanner(System.in);
        int kanal = scanner.nextInt();
        switch (kanal) {
            case 1:
                System.out.println("""
                        +-----------------------------+
                        |                       #NTS  |
                        |                             |
                        |          Реалити Шоу:       |
                        |         Биз жолуктук        |
                        |                             |
                        |                             |
                        |                             |
                        |_____________________________|""");
                break;
            case 2:
                System.out.println("""
                        +-----------------------------+
                        |                   #Баластан |
                        |                             |
                        |          Мультик:           |
                        |          Фиксики            |
                        |                             |
                        |                             |
                        |                             |
                        |_____________________________|""");
                break;
            case 3:
                System.out.println("""
                        +-----------------------------+
                        |                  #Тумар тв  |
                        |                             |
                        |         Нурлан Насип:       |
                        |         клип:Омур.          |
                        |                             |
                        |                             |
                        |                             |
                        |_____________________________|""");
                break;
            case 4:
                System.out.println("""
                        +-----------------------------+
                        |                      #КТРК  |
                        |                             |
                        |         Жанылыктар          |
                        |                             |
                        |                             |
                        |                             |
                        |                             |
                        |_____________________________|""");
                break;
            case 5:
                System.out.println("""
                        +-----------------------------+
                        |               #Ысык-Кол Тв  |
                        |                             |
                        |                             |
                        |        Жанылыктар           |
                        |                             |
                        |                             |
                        |                             |
                        |_____________________________|""");
                break;
            case 6:
                System.out.println("""
                        +-----------------------------+
                        |                       #РТР  |
                        |                             |
                        |                             |
                        |           Новости           |
                        |                             |
                        |                             |
                        |                             |
                        |_____________________________|""");
                break;
            case 7:
                System.out.println("""
                        +-----------------------------+
                        |                   #Ала-Тоо  |
                        |                             |
                        |                             |
                        |          Танкы Маанай       |
                        |                             |
                        |                             |
                        |                             |
                        |_____________________________|""");
                break;
            default:
                System.out.println("""
                        +-----------------------------+
                        |                    #New TV  |
                        |                             |
                        |                             |
                        |         Кино:Боз салкын     |
                        |                             |
                        |                             |
                        |                             |
                        |_____________________________|""");
                break;
        }
    }
}
