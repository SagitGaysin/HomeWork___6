public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
    public static void task1() {
        System.out.println("Задача 1");
        //Условие задачи: С помощью цикла for выведите в консоль все числа от 1 до 10.

        //Решение задачи:
        for (int i = 0; i <= 10; i += 1) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        //Условие задачи: С помощью цикла for выведите в консоль все числа от 10 до 1.

        //Решение задачи:
        for (int i = 10; i > 0; i -= 1) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        //Условие задачи: Выведите в консоль все четные числа от 0 до 17

        //Решение задачи:
        for (int i = 0; i <= 17; i += 2) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        //Условие задачи: Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему

        //Решение задачи:
        for (int i = 10; i >= -10; i -= 1) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println();
    }
    public static void task5 () {
        System.out.println("Задача 5");
        /* Условие задачи:
        Условие задачи: Напишите программу, которая выводит в консоль все високосные года,
         начиная с 1904 года до 2096. В консоль результат должен выводиться в формате: «… год является високосным».
         */

        //Решение задачи:
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();
    }
    public static void task6 () {
        System.out.println("Задача 6");
        //Напишите программу, которая выводит в консоль последовательность чисел:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98

        //Решение задачи:
        for (int i = 7; i <= 98; i += 7) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println();
    }
    public static void task7 () {
        System.out.println("Задача 7");
        //Напишите программу, которая выводит в консоль последовательность чисел:
        //1 2 4 8 16 32 64 128 256 512

        //Решение задачи:
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println();
    }
    public static void task8 () {
        System.out.println("Задача 8");
        /*Условие задачи:
        Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
        Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
        */

        //Решение:
        int monthlyPayment = 29_000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + monthlyPayment;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total +" рублей");
        }
        System.out.println("Итого накоплений в <<банке>> за 12 месяцев - " + total);
        System.out.println();
    }
    public static void task9 () {
        System.out.println("Задача 9");
        /* Условие задачи: Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку», а в банк под проценты — 12% годовых.
         Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».*/

        //Решение задачи:
        int monthlyPayment = 29_000;
        int total = 0;
        int monthlyPaymentWithPenny = monthlyPayment * 100;
        int totalWithPenny = 0;
        for (int i = 0; i < 12; i++) {
            totalWithPenny = totalWithPenny + totalWithPenny / 100;
            totalWithPenny = totalWithPenny + monthlyPaymentWithPenny;
            total = totalWithPenny / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Сумма накоплений в банке с процентами - " + total);
        System.out.println();
    }
    public static void task10 () {
        System.out.println("Задача 10");
        //условие задачи: Напишите программу, которая выводит в консоль таблицу умножения на 2

        //Решение задачи:
        int value = 2;
        int equal = 1;
        for (int i = 1; i <= 10; i++) {
            equal = value * i;
            System.out.println("2*" + i + "=" + equal);
        }
    }
}