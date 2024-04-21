package mission;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        personCreate();
        petCreate();

    }


    public static void personCreate() {
        System.out.println("Хотите создать человека? Да/Нет");
        Scanner scanner = new Scanner(System.in);
        String person = scanner.nextLine();
        if (person.equalsIgnoreCase("Да")) {
            System.out.println("Напишите имя человека");
            String name = scanner.nextLine();
            System.out.println("Напишите возраст человека");
            int age = scanner.nextInt();
        } else if (person.equalsIgnoreCase("Нет")) {
            throw new RuntimeException("Человек не создан");
        } else {
            throw new RuntimeException("Вы ввели что-то не так");
        }

    }

    public static void petCreate() {
        System.out.println("У вас есть питомец. Кошка или Собака?");
        Scanner scanner2 = new Scanner(System.in);
        String pet = scanner2.nextLine();

        switch (pet) {

            case "Кошка":
                System.out.println("Напишите имя кошки");
                String petName = scanner2.nextLine();
                System.out.println("Напишите возраст кошки");
                int petAge = scanner2.nextInt();
                System.out.println();
                break;
            case "Собака":
                System.out.println("Напишите имя собаки");
                String petName2 = scanner2.nextLine();
                System.out.println("Напишите возраст собаки");
                int petAge2 = scanner2.nextInt();
                break;
            case "Нету":
                System.out.println("Хотите создать еще одного человека. Да/Нет");
                String name3 = scanner2.nextLine();
            if (name3.equalsIgnoreCase("Да")) {
                personCreate();
            } else if (name3.equalsIgnoreCase("Нет")) {
                System.out.println("Пока");
            }

        }

    }
}






