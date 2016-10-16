package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String url = b.readLine();
        String smallurl = url.substring(url.indexOf("?") + 1);
        String[] parsed = smallurl.split("&");
        for(int i = 0; i < parsed.length; i++)
        {
            String [] j  = parsed[i].split("=");
            if (i == parsed.length -1) {
                System.out.print( j[0]);
            }else {
                System.out.print(j[0] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < parsed.length; i++)
        {
            String[] j = parsed[i].split("=");
            if (j[0].equals("obj"))
            {
               if (checkString(j[1])) {alert(Double.parseDouble(j[1]));
               } else alert(j[1]);
            }
        }// alert(Double.parseDouble(j[1]));
    }
    public static void alert(double value) {
        System.out.println("double " + value);
    }
    public static void alert(String value) {
        System.out.println("String " + value);
    }

    public static boolean checkString(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}