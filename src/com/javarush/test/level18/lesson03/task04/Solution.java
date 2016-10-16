package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {

        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String filename = reader.readLine();
            reader.close();
            Map<Integer, Integer> list = new HashMap<Integer, Integer>();
            FileInputStream inputStream = new FileInputStream(filename);
            while (inputStream.available() > 0) {
                int data = inputStream.read();
                if (list.containsKey(data)) {
                    int value = list.get(data);
                    list.put(data, ++value);
                }else {
                    list.put(data, 1);
                }
            }
            inputStream.close();

            int tmp = Integer.MAX_VALUE;
            for(Map.Entry<Integer, Integer> pair : list.entrySet()) {
                if (pair.getValue() < tmp){
                    tmp = pair.getValue();
                }
            }
            for (Map.Entry<Integer, Integer> min: list.entrySet()) {
                if (tmp == min.getValue()) {
                    System.out.print(min.getKey() + " ");
                }
            }
        }
    }

