package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();
        int max = 0;
        FileInputStream inputStream = new FileInputStream(filename);
        while (inputStream.available() >0) {
           int data = inputStream.read();
           if (data > max)   max = data;
        }
        inputStream.close();
        System.out.println(max);
    }
}
