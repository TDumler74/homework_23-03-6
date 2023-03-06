package homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File fileName = new File("input.txt");
        System.out.println(readIntoString(fileName));
        System.out.println(countAverage("inputint.txt"));

        /**
         * Написать метод, читающий текстовый файл и возвращающий строку,
         * состояшую из всех прочитанных строчек.
         * Пример: В файле имеется
         * aaa
         * bbbb
         * cc
         * Метод вернет aaa bbbb cc
         */

    }

    public static String readIntoString(File fileName) {
        String s = "";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                s = s + " " + line;
            }
        } catch (IOException e) {
            e.getMessage();
        }
        return s;
    }

    public static double countAverage(String fileName) {
        int sum = 0;// Variable erstellen
        int count = 0;// counter erstellen, damit die gelesenen Zeilen gezählt werden
        String nextInt;//Zeile, in die das gezählte gelegt wird
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((nextInt = br.readLine()) != null) {// in unsere Zeile legen wir alle gelesene Zeilen bis zum erreichen vom Ende durch null
                sum = sum + Integer.parseInt(nextInt);
                count++;//mit jeder gezählten Zeile summieren wir und verändern unsere Zeile in zahl mit parseInt, und counter vergrößert sich mit jedem durchlauf .so dass am Ende wir alle gelesene Zahlen bekommen

            }
        }catch (IOException e){
            e.getMessage();
        }
        return sum/count;

    }

/**
 * Есть не пустой текстовый файл такого вида:
 * 1
 * 2
 * 3
 * 4
 * 5
 * Написать метод, возвращаюший среднее арифметическое всех этих чисел.
 */
}
