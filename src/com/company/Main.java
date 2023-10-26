package com.company;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.err.println("hello world");































//        // Television
        Scanner forString = new Scanner(System.in);

        String[] channel = new String[]{
                """
                         WELCOME TO
                             SAMSUNG SMART TV
                    """,
                """
                    channel name      KTRK\n
                        channel number     1
                    """,
                """
                    channel name      Ala Too 24\n
                        channel number     2
                    """,
                """
                    channel name      Balastan\n
                        channel number     3
                    """,
                """
                    channel name      ElTR\n
                       channel number     4
                    """,
                """
                    channel name      KTRK Sport\n
                       channel number     5
                    """,
                """
                    channel name      Madaniyat\n
                       channel number     6
                    """,
                """
                    channel name      Muzika\n
                       channel number     7
                    """,
                """
                    channel name      NTS\n
                       channel number     8
                    """
        };
        String tv = "off";
        int channelNumber = 0;

        while (true) {
            System.out.println("""
                                       TV пульт
                        +------------------------------------+
                        |   off                          on  |
                        |      <- back   (menu)  next ->     |
                        |          1    2     3    4         |
                        |          5    6     7    8         |
                        +------------------------------------+

                     Телевизорду күйгүзүү үчүн "on" сөзүн жазыңыз
                     Телевизорду өчүрүү үчүн "off" сөзүн жазыңыз
                     Менюга кирүү үчүн "menu" сөзүн жазыныз
                     Каалаган каналга өтүү үчүн каналдын номерин жазыңыз
                     Кийинки каналга өтүү үчүн "next" сөзүн жазыныз
                     Арткы каналга кайтуу  үчүн "back" сөзүн жазыныз

                    """);
            String command = forString.nextLine();
            if (!(tv.equals("on"))){
                tv = command;
            }
            if (Objects.equals(tv, "on")) {
                switch (command) {
                    case "on" ->{
                        System.out.printf("""
                        +---------------------------------------+

                                %s

                        +---------------------------------------+
                        """, channel[channelNumber]);
                    }
                    case "menu" -> {
                        System.out.println("~~~~~~~ All channels, number of channels 8 ~~~~~~~~");
                        System.out.println("___________________________");
                        for (int i = 1; i < channel.length; i++) {
                            System.out.println(channel[i]);
                            System.out.println("___________________________");
                        }
                    }
                    case "next" -> {
                        if (channelNumber == 8) {
                            channelNumber = 1;
                        } else {
                            channelNumber++;
                        }
                        System.out.printf("""
                        +---------------------------------------+

                                %s

                        +---------------------------------------+
                        """, channel[channelNumber]);
                    }
                    case "back" -> {
                        if (channelNumber == 1) {
                            channelNumber = 8;
                        } else {
                            channelNumber--;
                        }
                        System.out.printf("""
                        +---------------------------------------+

                                %s

                        +---------------------------------------+
                        """, channel[channelNumber]);
                    }
                    case "1" -> {
                        channelNumber = 1;
                        System.out.printf("""
                        +---------------------------------------+

                                %s

                        +---------------------------------------+
                        """, channel[channelNumber]);
                    }
                    case "2" ->{
                        channelNumber = 2;
                        System.out.printf("""
                        +---------------------------------------+

                                %s

                        +---------------------------------------+
                        """, channel[channelNumber]);
                    }
                    case "3" -> {
                        channelNumber = 3;
                        System.out.printf("""
                        +---------------------------------------+

                                %s

                        +---------------------------------------+
                        """, channel[channelNumber]);
                    }
                    case "4" ->{
                        channelNumber = 4;
                        System.out.printf("""
                        +---------------------------------------+

                                %s

                        +---------------------------------------+
                        """, channel[channelNumber]);
                    }
                    case "5" -> {
                        channelNumber = 5;
                        System.out.printf("""
                        +---------------------------------------+

                                %s

                        +---------------------------------------+
                        """, channel[channelNumber]);
                    }
                    case "6" -> {
                        channelNumber = 6;
                        System.out.printf("""
                        +---------------------------------------+

                                %s

                        +---------------------------------------+
                        """, channel[channelNumber]);
                    }
                    case "7" -> {
                        channelNumber = 7;
                        System.out.printf("""
                        +---------------------------------------+

                                %s

                        +---------------------------------------+
                        """, channel[channelNumber]);
                    }
                    case "8" -> {
                        channelNumber = 8;
                        System.out.printf("""
                        +---------------------------------------+

                                %s

                        +---------------------------------------+
                        """, channel[channelNumber]);
                    }
                    case "off" -> {
                        System.out.println("""
                        +---------------------------------------+

                                       TV OFF

                        +---------------------------------------+
                        """);
                        tv = "off";
                    }
                    default -> {
                        System.err.println("Туура эмес кноппканы басып жатасын!");
                    }
                }
            } else {
                System.err.println("Телевизорду жандырмайынча башка коммандаларды баса албайсын");
            }
        }
    }

}

//        int currentChannel = 1; // Начальный канал
//        int maxChannels = 100; // Общее количество каналов
//
//        while (true) {
//            System.out.println("Текущий канал: " + currentChannel + " - " + getChannelName(currentChannel));
//            System.out.println("Выберите действие:");
//            System.out.println("1. Следующий канал");
//            System.out.println("2. Предыдущий канал");
//            System.out.println("3. Перейти к каналу по номеру");
//            System.out.println("0. Выход");
//
//            int choice = getUserChoice();
//
//            switch (choice) {
//                case 1:
//                    currentChannel = nextChannel(currentChannel, maxChannels);
//                    break;
//                case 2:
//                    currentChannel = previousChannel(currentChannel, maxChannels);
//                    break;
//                case 3:
//                    System.out.println("Введите номер канала: ");
//                    int channelNumber = getUserChoice();
//                    currentChannel = gotoChannel(channelNumber, maxChannels);
//                    break;
//                case 0:
//                    System.out.println("Выход из программы.");
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Неверный выбор. Попробуйте еще раз.");
//            }
//        }
//    }
//
//    public static int getUserChoice() {
//        java.util.Scanner scanner = new java.util.Scanner(System.in);
//        return scanner.nextInt();
//    }
//
//    public static int nextChannel(int currentChannel, int maxChannels) {
//        return (currentChannel % maxChannels) + 1;
//    }
//
//    public static int previousChannel(int currentChannel, int maxChannels) {
//        return (currentChannel - 2 + maxChannels) % maxChannels + 1;
//    }
//
//    public static int gotoChannel(int channelNumber, int maxChannels) {
//        if (channelNumber >= 1 && channelNumber <= maxChannels) {
//            return channelNumber;
//        } else {
//            System.out.println("Номер канала вне диапазона. Останетесь на текущем канале.");
//            return currentChannel;
//        }
//    }
//
//    public static String getChannelName(int channelNumber) {
//        // Здесь можно добавить логику для определения названия канала по его номеру
//        // Например, можно использовать массив строк или другую структуру данных для хранения названий каналов.
//        // В данном примере просто возвращается строка с номером канала.
//        return "Канал " + channelNumber;
//    }

































