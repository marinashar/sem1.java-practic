package HomeworkSeminar1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        System.out.println(task1(10, 6));
//        task2(0);
//        System.out.println(task3(0));
//        task4("Марина", 3);
//        task6();
//        task7();
//        task8();
//        task9();
//        task10(5, 2);
    }

    private static boolean task1(int a, int b) {
        // 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма
        // лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
        // в противном случае – false.

        return a + b >= 10 && a + b <= 20;
    }

    private static void task2(int a) {
        // 2. Написать метод, которому в качестве параметра передается целое число, метод должен
        // напечатать в консоль, положительное ли число передали или отрицательное.
        // Замечание: ноль считаем положительным числом.

        if (a >= 0) {
            System.out.printf("Число %d - положительное", a);
        } else {
            System.out.printf("Число %d - отрицательное", a);
        }
    }

    private static boolean task3(int a) {
//       3. Написать метод, которому в качестве параметра передается целое число. Метод должен
//        вернуть true, если число отрицательное, и вернуть false если положительное.
        return a < 0;
    }

    private static void task4(String str, int a) {
//        4. Написать метод, которому в качестве аргументов передается строка и число,
//        метод должен отпечатать в консоль указанную строку, указанное количество раз;
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    private static void task6() {
//       6. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//        С помощью цикла и условия заменить 0 на 1, 1 на 0;
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = random.nextInt(2);
        }
        System.out.println("Первоначальный массив: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1;
        }
        System.out.println("Перевернутый массив:   " + Arrays.toString(arr));
    }

    private static void task7() {
//        7. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить
//        его значениями 1 2 3 4 5 6 7 8 … 100;
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void task8() {
//        8. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
//        и числа меньшие 6 умножить на 2;
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Заданный массив    -    " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println("Элементы меньше 6 * 2 - " + Arrays.toString(arr));
    }

    private static void task9() {
//        9. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//        и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну
//        из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по
//        следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    private static void task10(int len, int initialValue) {
//        10. Написать метод, принимающий на вход два аргумента: len и initialValue,
//        и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}


