package Seminar_4;

import jdk.internal.net.http.LineSubscriberAdapter;
import sun.tools.jconsole.Messages;

import java.io.*;
import java.util.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

import static jdk.internal.org.jline.utils.Colors.s;

public class Main {
    public static void main(String[] args) {
//        ex1();
        ListRandom(11,25);
    }

    //    Реализовать консольное приложение, которое:
//    Принимает от пользователя и “запоминает” строки.
//    Если введено print, выводит строки так, чтобы последняя введенная
//    была первой в списке, а первая - последней.
//    Если введено revert, удаляет предыдущую введенную строку из памяти.
    private static void ex1() {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> stringList = new LinkedList<>();
        while (true) {
            System.out.print("Введите строку: ");
            String word;
            if ((word = scanner.nextLine()).equals("print")) {
                String firstNumber = stringList.removeFirst();
                String lastNumber = stringList.removeLast();
                stringList.add(0, lastNumber);
                stringList.add(firstNumber);
                System.out.println(stringList);
                break;
            } else {
                stringList.add(word);
            }
        }
    }


//    Пусть дан LinkedList с несколькими элементами.
//    Реализуйте метод, который вернет “перевернутый” список.


    private static LinkedList<String> ListRandom(int quantity, int interval) {
        LinkedList<String> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < quantity; i++) {  //получение случайного списка
            list.add(String.valueOf(random.nextLong(interval)));
        }
        System.out.println("Исходный список :\n" + list);
        for (int i = 0; i < list.size() / 2; i++) {
            String temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }
        System.out.println("Перевернутый список :\n" + list);
        return list;
    }
}

