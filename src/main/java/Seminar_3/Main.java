package Seminar_3;


import java.util.*;
import java.util.Random;
import com.google.common.math.Stats;


public class Main {
    public static void main(String[] args) {
        arrayRandom(25, 15);
//        minMaxAverage(12, 25);
    }

//1. Пусть дан произвольный список целых чисел,
//   удалить из него четные числа (в языке уже есть что-то готовое для этого)

    private static ArrayList<Integer> arrayRandom(int quantity, int interval) {
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < quantity; i++) {  //получение случайного массива
            array.add(random.nextInt(interval));
        }
        System.out.println("Исходный список целых чисел :\n" + array);
        array.removeIf(value -> (value % 2) == 0);
        System.out.println("Список из нечетных чисел :\n" + array);
        return array;
    }


    //2. Задан целочисленный список ArrayList.
//   Найти минимальное, максимальное и среднее арифметическое из этого списка.
    private static ArrayList<Integer> minMaxAverage(int quantity, int interval) {
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < quantity; i++) {  //получение случайного массива
            array.add(random.nextInt(interval));
        }

        int max = Collections.max(array);
        int min = Collections.min(array);
        double average = Stats.meanOf(array); // необходимо ввести округление
        System.out.println("Исходный список целых чисел :\n" + array);
        System.out.println("Минимальное значение в списке : " + min);
        System.out.println("Максимальное значение в списке : " + max);
        System.out.println("Среднее арифметичекое значение списка :" + average);
        return array;
    }
}