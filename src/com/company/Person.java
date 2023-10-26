package com.company;

import java.util.Scanner;

public class Person {

        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {

            tv();

        }

        public static void tv() {
            String command;
            boolean tvOn = false;
            int kanaldar = 1;


            while (true) {
                System.out.println("""
            -----------------------
            | off             on  |
            |    back    next     |
            |        menu         |
            |    1   2   3   4    |
            -----------------------
            Televizordu kuiguzuu uchun  "on"
            Televiordu ochuruu uchun "off" 
            Menuga kiruu "menu" 
            Kiyinki kanal "next"
            Murdagy kanal "back" 
            Programmany toktotuu uchun "exit"
            """);
                command = scanner.nextLine();

                switch (command) {
                    case "on":
                        if (!tvOn) {
                            System.out.println("Televizor kuidu.");
                            tvOn = true;
                        } else {
                            System.out.println("Televizor kuigon.");
                        }
                        break;
                    case "off":
                        if (tvOn) {
                            System.err.println("Televizor ochuk.");
                            tvOn = false;
                        } else {
                            System.out.println("Televizor kuiuk.");
                        }
                        break;
                    case "menu":
                        if (tvOn) {
                            System.out.println("Menu: ");

                        } else {
                            System.err.println("Televizor ochuk kuiguzunuz..");
                        }
                        break;
                    case "next":
                        if (tvOn) {
                            kanaldar++;
                            System.out.println("Kiyinki kanal: " + kanaldar);
                        } else {
                            System.err.println("Televizor ochuk kuiguzunuz.");
                        }
                        break;
                    case "back":
                        if (tvOn) {
                            if (kanaldar > 1) {
                                kanaldar--;
                                System.out.println("Murdagy kanal: " + kanaldar);
                            } else {
                                System.out.println("Birinchi kanaldasyz.");
                            }
                        } else {
                            System.err.println("Televizor ohcuk birinchi kuiguzunuz.");
                        }
                        break;
                    case "exit":
                        System.err.println("programma toktodu.");
                        return;
                    default:
                        System.err.println("Komanda tuura emes berildi.");
                        break;
                }
            }
        }

    public static void kanal(int n){
        switch (n){
            case 1:
                System.out.println("""
            -----------------------
            | 1              KTRK |
            |                     |
            |                     |
            |                     |
            |                     |
            -----------------------
                        """);
            case 2:
                System.out.println("""
            -----------------------
            | 2              MUZ  |
            |                     |
            |                     |
            |                     |
            |                     |
            -----------------------
                        """);
            case 3:
                System.out.println("""
            -----------------------
            | 3              MTV  |
            |                     |
            |                     |
            |                     |
            |                     |
            -----------------------
                        """);
            case 4:
                System.out.println("""
            -----------------------
            | 4              BCC  |
            |                     |
            |                     |
            |                     |
            |                     |
            -----------------------
                        """);
        }
    }
}
