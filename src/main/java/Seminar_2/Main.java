package Seminar_2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        repetitions();
    }

    //1. Напишите метод, который принимает на вход строку (String) и
//   определяет является ли строка палиндромом (возвращает boolean значение).
    private static boolean palindrome() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String num = iScanner.nextLine();
        for (int i = 0; i < num.length() / 2; i++) {
            System.out.println(num.charAt(i) == num.charAt(num.length() - i - 1));
            return true;
        }
        return true;
    }


//2. Напишите метод, который составит строку, состоящую из 100 повторений
//   слова TEST и метод, который запишет эту строку в простой текстовый файл,
//   обработайте исключения.

    private static void repetitions() {
        String result = "";
        for (int i = 0; i < 100; i++) {
            result = result + "TEST";
        }
        System.out.print(result);
        try (FileWriter writer = new FileWriter("notes.txt", false)) {
            writer.write(result);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
